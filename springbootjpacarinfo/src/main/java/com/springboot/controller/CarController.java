package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.CarService;
import com.springboot.entity.Car;


@RestController
public class CarController {

	@Autowired
	CarService carservice;
	
	@PostMapping("/car")
	public String addCar(@RequestBody Car car) {
		String message = carservice.addCarInDataBase(car);
		return message;
	}
	
	@GetMapping("/car/{id}")
	public Car getCar(@PathVariable int id) {
		return carservice.getCarDataFromDB(id);
	}
	
	@PutMapping("/car")
	public String updateCar(@RequestBody Car car) {
		return carservice.updateDataofCar(car);
	}
	
	@DeleteMapping("/car/{id}")
	public String deleteCar(@PathVariable int id) {
		return carservice.deleteDataofCar(id);
	}
}
