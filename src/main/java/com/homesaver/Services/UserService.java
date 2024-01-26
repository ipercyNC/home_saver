package com.homesaver.Services;

import java.util.List;

import com.homesaver.Models.User;

public interface UserService {
    List<User> getAllUsers();
    User getById(int id);
}
