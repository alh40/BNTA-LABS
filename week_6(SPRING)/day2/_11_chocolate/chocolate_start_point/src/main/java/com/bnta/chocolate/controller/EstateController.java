package com.bnta.chocolate.controller;


import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;


    @GetMapping("/estate/{id}")
    public Optional<Estate> getEstate(@PathVariable long id){
        return estateService.getEstateById(id);
    }

    @PostMapping("/estate")
    Estate post(@RequestBody Estate estate1){
        return estateService.save(estate1);
    }

//    Query
//    SELECT
//*
//FROM
//chocolate
//WHERE
//cocoa_percentage >= 60
//ORDER BY cocoa_percentage ASC

}
