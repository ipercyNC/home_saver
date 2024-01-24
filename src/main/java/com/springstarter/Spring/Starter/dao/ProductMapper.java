package com.springstarter.Spring.Starter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springstarter.Spring.Starter.Models.Product;

public class ProductMapper implements RowMapper<Product> {
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product p = new Product();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setModelNumber(rs.getString("modelnumber"));
        p.setBrand(rs.getString("brand"));
        return p;
    }
}
