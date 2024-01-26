package com.springstarter.Spring.Starter.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstarter.Spring.Starter.Models.Dwelling;
import com.springstarter.Spring.Starter.dao.DwellingDao;

@Service
public class DwellingSerivceImpl implements DwellingService{
    @Autowired
    DwellingDao dwellingDao;

    @Autowired
    private UserService userService;

    @Override
    public List<Dwelling> getAllDwellings() {
        List<Dwelling> dwellings = dwellingDao.getAllDwellings();
        for (Dwelling d: dwellings) {
            d.setUser(userService.getById(d.getUserId()));
        }
        return dwellings;
    }
    
}
