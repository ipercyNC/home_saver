package com.springstarter.Spring.Starter.Services;

import java.util.List;

import com.springstarter.Spring.Starter.Models.User;

public interface UserService {
    List<User> getAllUsers();
    User getById(int id);
}
