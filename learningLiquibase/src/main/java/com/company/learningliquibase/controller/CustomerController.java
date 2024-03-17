package com.company.learningliquibase.controller;

import com.company.learningliquibase.entity.Customer;
import com.company.learningliquibase.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    public CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customers = customerRepository.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

}
