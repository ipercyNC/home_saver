package com.homesaver.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homesaver.Services.AuthService;

@RestController
@CrossOrigin
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping(value="/auth")
    public Boolean login(){
        String username = "jstanley";
        String password = "password";
        return authService.login(username, password);
    }

}
