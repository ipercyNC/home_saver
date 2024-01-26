package com.homesaver.Services;

import java.util.List;

import com.homesaver.Models.Product;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByDwelling(int id);
}
