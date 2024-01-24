package com.springstarter.Spring.Starter.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstarter.Spring.Starter.Models.Product;
import com.springstarter.Spring.Starter.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productDao.getAllProducts();
        return products;
    }
}
