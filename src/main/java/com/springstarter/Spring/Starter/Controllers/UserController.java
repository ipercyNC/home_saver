package com.springstarter.Spring.Starter.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstarter.Spring.Starter.Models.User;
import com.springstarter.Spring.Starter.Services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/user")
    public List<User> getUser(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}
