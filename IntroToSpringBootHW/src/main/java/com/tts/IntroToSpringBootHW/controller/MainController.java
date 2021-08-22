package com.tts.IntroToSpringBootHW.controller;

import com.tts.IntroToSpringBootHW.model.Customer;
import com.tts.IntroToSpringBootHW.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

// RestController is a stereotype annotation that denotes
// specific behaviors regarding web requests and responses
@RestController

public class MainController {

    @Autowired
    CustomerRepository customerRepository;

    // This getting mapping tells spring to come here, and resolve this method
    // when we reach localhost:8080
//    @GetMapping("/")
//    public String getHome(){
//        return "Intro to Spring Boot HW";
//    }


    @GetMapping("/random")
    public Integer getRandomInteger() {
        Random random = new Random();
        return  random.nextInt(1000);
    }

    @GetMapping("/customer/all")
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }


    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerRepository.findById(id).orElseThrow();
    }
}
