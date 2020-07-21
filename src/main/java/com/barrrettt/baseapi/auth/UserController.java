package com.barrrettt.baseapi.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/users/{username}")
    public UserModel getByID(@PathVariable String username) {
        if (username == null)return null;
        UserModel user = userRepo.getUser(username);
        return user;
    }

    @RequestMapping("/users/")
    public List<UserModel> getAll() {
        return userRepo.getAll();
    }
    
    @PostMapping("/users")
    Boolean newUser(@RequestBody UserModel newUser) {
      return userRepo.createUser(newUser);
    }
    
    @DeleteMapping("/users/{username}")
    Boolean deleteUser(@PathVariable String username) {
      return userRepo.deleteUser(username);
    }
}