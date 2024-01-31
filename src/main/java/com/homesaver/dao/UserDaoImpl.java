package com.homesaver.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.homesaver.Models.User;


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
        List<User> users = jtm.query(sql, new UserMapper(), id);
        return users;
    }

    @Override
    public Boolean login(String username, String password) {
        String sql = "SELECT * from users where username = ? and password = ?";
        List<User> users = jtm.query(sql, new UserMapper(), username, password);
        if (users.size() > 0){
            return true;
        }
        return false;
    }
    
    @Override
    public User getByUsername(String username) {
        String sql = "SELECT * from users where username = ?";
        List<User> users = jtm.query(sql, new UserMapper(), username);
        if (users.size() > 0) {
            return users.get(0);
        }
        else {
            return null;
        }
    }
}
