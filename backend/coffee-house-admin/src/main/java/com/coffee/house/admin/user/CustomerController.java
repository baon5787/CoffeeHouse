package com.coffee.house.admin.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.house.models.entity.User;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
	
	private final UserResponsitory responsitory;
	
	private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L, "john", "doe", "john@javawhizz.com"),
            new Customer(2L, "mary", "public", "mary@javawhizz.com"),
            new Customer(3L, "elon", "musk","elon@javawhizz.com"),
            new Customer(4L, "dunny","duncan","dunny@javawhizz.com")
    );
	
    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
    
    @GetMapping("/all")
    public List<User> findAllUser(){
        return responsitory.findAll();
    }
}
