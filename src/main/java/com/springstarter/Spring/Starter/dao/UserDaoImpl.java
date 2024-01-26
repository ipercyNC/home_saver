package com.springstarter.Spring.Starter.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springstarter.Spring.Starter.Models.User;


@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jtm;

    public UserDaoImpl(JdbcTemplate jtm) {
        this.jtm = jtm;
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * from users";
        List<User> users = jtm.query(sql, new UserMapper());
        return users;
    }

    @Override
    public List<User> getById(int id) {
        String sql = "SELECT * from users where id = ?";
        List<User> user = jtm.query(sql, new UserMapper(), id);
        return user;
    }
    
}
