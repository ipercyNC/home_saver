package com.homesaver.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homesaver.Models.User;
import com.homesaver.Services.UserService;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/user")
    public List<User> getUser(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}
