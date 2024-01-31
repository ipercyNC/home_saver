package com.homesaver.Services;

import com.homesaver.Models.User;

public interface AuthService {
    User login(String username, String password);
}
