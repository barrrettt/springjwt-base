package com.barrrettt.baseapi.security;

import java.util.HashSet;

import com.barrrettt.baseapi.auth.UserModel;
import com.barrrettt.baseapi.auth.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepo.getUser(username);//get name and pass from database
        if (user == null) throw new UsernameNotFoundException("Incorrect username");
        return new User(user.getName(),user.getPassword(), getAuthority(user));
    }

    //get roles (de user: están separados por ;)
    private HashSet<SimpleGrantedAuthority> getAuthority(UserModel user){
        HashSet<SimpleGrantedAuthority> authorities = new HashSet<>();
        String[] roles = user.getRoles().split(";");
		for (String rol : roles) {
            authorities.add(new SimpleGrantedAuthority(rol));
        }
		return authorities;
    }
    
}
