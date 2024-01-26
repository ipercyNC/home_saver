package com.homesaver.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homesaver.Models.Product;
import com.homesaver.Services.ProductService;

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