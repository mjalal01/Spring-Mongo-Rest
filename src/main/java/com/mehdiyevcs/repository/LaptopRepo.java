package com.mehdiyevcs.repository;

import com.mehdiyevcs.model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LaptopRepo extends MongoRepository<Laptop,Integer> {

    Laptop findFirstByModel(String model);

}
