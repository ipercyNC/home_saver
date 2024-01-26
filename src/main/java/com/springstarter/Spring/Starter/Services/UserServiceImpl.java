package com.springstarter.Spring.Starter.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstarter.Spring.Starter.Models.User;
import com.springstarter.Spring.Starter.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
    @Autowired 
    UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        return users;
    }

    @Override
    public User getById(int id) {
        User user = userDao.getById(id).get(0);
        return user;
    }
    
}
