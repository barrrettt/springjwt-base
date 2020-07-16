package com.barrrettt.baseapi.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //abc123.. con https://bcrypt-generator.com/
        return new User("admin","$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa",new ArrayList<>());
    }
    
}
