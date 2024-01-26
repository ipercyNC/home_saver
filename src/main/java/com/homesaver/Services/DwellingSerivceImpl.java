package com.homesaver.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homesaver.Models.Dwelling;
import com.homesaver.dao.DwellingDao;

@Service
public class DwellingSerivceImpl implements DwellingService{
    @Autowired
    DwellingDao dwellingDao;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Override
    public List<Dwelling> getAllDwellings() {
        List<Dwelling> dwellings = dwellingDao.getAllDwellings();
        for (Dwelling d: dwellings) {
            d.setUser(userService.getById(d.getUserId()));
            d.setProducts(productService.getProductsByDwelling(d.getId()));
        }
        return dwellings;
    }
    
}
