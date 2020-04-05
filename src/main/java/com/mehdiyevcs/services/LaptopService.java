package com.mehdiyevcs.services;

import com.mehdiyevcs.repository.LaptopRepo;
import com.mehdiyevcs.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;


    public void saveLaptop(Laptop laptop){
        laptopRepo.save(laptop);
    }

    public Iterable<Laptop> findAll(){
        return laptopRepo.findAll();
    }
}
