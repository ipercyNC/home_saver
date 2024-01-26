package com.springstarter.Spring.Starter.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstarter.Spring.Starter.Models.Dwelling;
import com.springstarter.Spring.Starter.Services.DwellingService;

@RestController
public class DwellingController {
    @Autowired
    private DwellingService dwellingService;

    @GetMapping(value="/dwelling")
    public List<Dwelling> getAllDwellings() {
        List<Dwelling> dwellings = dwellingService.getAllDwellings();
        return dwellings;
    }
}
