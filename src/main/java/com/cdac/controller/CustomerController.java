package com.cdac.controller;

import com.cdac.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping
    public List<Customer> handleGetAll(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Vinod", "vinod@vinod.co"));
        customers.add(new Customer(2, "Shyam", "shyam@xmpl.com"));
        return customers;
    }
}
