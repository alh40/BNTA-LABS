package com.bnta.chocolate.controller;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/chocolate/{id}")
    public Chocolate getChocolate(@PathVariable int id){
        return chocolateService.getChocolate();
    }

    @PostMapping("/chocolate")
    Chocolate post(@RequestBody Chocolate chocolate1){
        return chocolateService.save(chocolate1);
    }
}
