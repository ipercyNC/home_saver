package com.homesaver.dao;

import java.util.List;

import com.homesaver.Models.User;

public interface UserDao {
    List<User> getAllUsers();
    List<User> getById(int id);
    User getByUsername(String username);
    Boolean login(String username, String password);
}