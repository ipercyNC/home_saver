package com.homesaver.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.homesaver.Models.Product;
import com.homesaver.Models.User;

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

    @Override
    public List<Product> getProductsByDwelling(int id) {
        String sql = "SELECT * FROM product where id in (select product_id from dwelling_products where dwelling_id = ?)";
        List<Product> products = jtm.query(sql, new ProductMapper(), id);
        return products;
    }
}
