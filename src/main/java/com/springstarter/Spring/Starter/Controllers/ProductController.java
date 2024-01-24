package com.springstarter.Spring.Starter.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstarter.Spring.Starter.Models.Product;
import com.springstarter.Spring.Starter.Services.ProductService;

@RestController
public class ProductController{
    @Autowired
    private ProductService productService;

    @GetMapping(value="/product")
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return products;
    }
}