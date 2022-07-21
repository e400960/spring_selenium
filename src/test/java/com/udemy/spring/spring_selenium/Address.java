package com.udemy.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${street:begur koppa road}")
    private String street;

    @Autowired
    private Faker faker;

 //   public Address(){ this.street = "begur road";  }

    public String getStreet() {

        //return street;
        return this.faker.address().streetAddress();
    }
}
