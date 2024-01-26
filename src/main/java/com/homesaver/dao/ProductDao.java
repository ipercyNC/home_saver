package com.homesaver.dao;

import java.util.List;

import com.homesaver.Models.Product;

public interface ProductDao {
    List<Product> getAllProducts();
    List<Product> getProductsByDwelling(int id);
}
