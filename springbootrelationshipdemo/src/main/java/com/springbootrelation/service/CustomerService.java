package com.springbootrelation.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrelation.entity.Customer;
import com.springbootrelation.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo custorepo;
	
	public Customer addCustomerInDataBase(Customer customer) {
		Customer obj = custorepo.save(customer);
		return obj;
	}
	
	public Customer getCustomerFromDataBase(int id) {
		Optional<Customer> custo =  custorepo.findById(id);
		return custo.get();
	}
	
	/*public String deleteDataofCar(int id) {
		Optional<Car> optionalcar = carrepository.findById(id);

		if (optionalcar.isEmpty()) {
			return "Car with id number " + id + " is not in database";
		} else {
			carrepository.deleteById(id);
			return "Data of car with id number " + id + " is deleted";
		}
	}*/

}
