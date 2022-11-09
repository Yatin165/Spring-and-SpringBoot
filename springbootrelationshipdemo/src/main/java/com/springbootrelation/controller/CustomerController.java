package com.springbootrelation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrelation.entity.Customer;
import com.springbootrelation.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		Customer custobj = customerservice.addCustomerInDataBase(customer);
		return custobj;
	}
	
	@GetMapping("/customer")
	public Customer getCustomer(int id) {
		Customer custobj = customerservice.getCustomerFromDataBase(id);
		return custobj;
	}
	
	
}
