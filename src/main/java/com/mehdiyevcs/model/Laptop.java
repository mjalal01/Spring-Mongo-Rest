package com.mehdiyevcs.model;

import jdk.nashorn.internal.objects.annotations.Property;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "laptops")
public @Data
class Laptop {

    //@Id
    //private int laptopId;

    @Field(name = "model")
    private String model;

    @Field(name = "processor_model")
    private String processorModel;

}
