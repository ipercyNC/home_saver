package com.springstarter.Spring.Starter.dao;

import java.util.List;
import com.springstarter.Spring.Starter.Models.User;

public interface UserDao {
    List<User> getAllUsers();
    List<User> getById(int id);
}