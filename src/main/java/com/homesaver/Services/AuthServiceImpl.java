package com.homesaver.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.homesaver.Models.User;
import com.homesaver.dao.UserDao;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UserDao userDao;

    @Override
    public User login(String username, String password) {
    PasswordEncoder encoder = new BCryptPasswordEncoder(); 
        User user = userDao.getByUsername(username);
        if (encoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }
}
