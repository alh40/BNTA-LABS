package com.bnta.chocolate.controller;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @GetMapping("/estate/{id}")
    public Estate getEstate(@PathVariable int id){
        return estateService.getEstate();
    }

    @PostMapping("/estate")
    Estate post(@RequestBody Estate estate1){
        return estateService.save(estate1);
    }

}
