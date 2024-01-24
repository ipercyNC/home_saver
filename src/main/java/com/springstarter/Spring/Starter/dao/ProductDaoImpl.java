package com.springstarter.Spring.Starter.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springstarter.Spring.Starter.Models.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final JdbcTemplate jtm;

    public ProductDaoImpl(JdbcTemplate jtm) {
        this.jtm = jtm;
    }

    @Override
    public List<Product> getAllProducts() {
        String sql = "SELECT * from product";
        List<Product> products = jtm.query(sql, new ProductMapper());
        return products;
    }
}
