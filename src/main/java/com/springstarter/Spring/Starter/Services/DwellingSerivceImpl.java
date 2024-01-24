package com.springstarter.Spring.Starter.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springstarter.Spring.Starter.Models.Dwelling;

@Service
public class DwellingSerivceImpl implements DwellingService{

    @Override
    public List<Dwelling> findAll() {
        ArrayList<Dwelling> dwellings = new ArrayList<Dwelling>();
        dwellings.add(new Dwelling(200, "", "123 Road NC", 1));
        return dwellings;
    }
    
}
