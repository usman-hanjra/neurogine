package com.neurogine.store.neuroginestoreapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "stores")
public class Store {
    @Id
    private String id;
    private String name;
    private Location location;
    private String deliveryTime;
    private double deliveryAmount;
    private double rating;
    private List<String> storeType;
    private List<Discount> discounts;
    private List<Promotion> promotions;

}

class Location {
    private String type;
    private double[] coordinates;

    
}

class Discount {
    private String item;
    private double discountPercentage;

    
}

class Promotion {
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;

    
}
