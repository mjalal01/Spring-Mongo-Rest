package com.mehdiyevcs.controller;

import com.mehdiyevcs.model.Laptop;
import com.mehdiyevcs.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    LaptopService laptopService;

    @GetMapping(value = "/getLaptops")
    public Iterable<Laptop> getAllLaptop(){
        return laptopService.findAll();
    }

    @PostMapping(value = "/saveLaptop")
    public Laptop saveLaptop(@RequestBody Laptop laptop){
        laptopService.saveLaptop(laptop);
        return laptop;
    }

}
