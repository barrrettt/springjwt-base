package com.barrrettt.baseapi.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/users/{id}")
    public UserModel getByID(@PathVariable Long id) {
        if (id == null)return null;
        UserModel user = userRepo.getUser(Long.valueOf(id));
        return user;
    }

    @RequestMapping("/users/")
    public List<UserModel> getAll() {
        return userRepo.getAll();
    }
    
}