package com.homesaver.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homesaver.Models.Product;
import com.homesaver.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productDao.getAllProducts();
        return products;
    }

    @Override
    public List<Product> getProductsByDwelling(int id) {
        List<Product> products = productDao.getProductsByDwelling(id);
        return products;
    }
    
}
