package com.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Car;
import com.springboot.repo.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carrepository;
	
	public String addCarInDataBase(Car car) {
		if (carrepository.findById(car.getId()).isPresent()) {
			return "Data of the Car with Id Number  " + car.getId() + " is already added";
		}
		Car savecarobj = carrepository.save(car);
		return "Data of the Car with Id Number " + savecarobj.getId() + " added";
	}
	
	
	public Car getCarDataFromDB(int id) {
		Optional<Car> optionalCar = carrepository.findById(id);
		System.out.println(optionalCar);
		Car carobj = optionalCar.get();
		return carobj;
	}
	
	@Transactional
	public String updateDataofCar(Car car) {
		Optional<Car> optionalcar = carrepository.findById(car.getId());
		if (optionalcar.isEmpty()) {
			return "Car with id number " + car.getId() + " is not in Database";
		} else {
			Car CarInDB = optionalcar.get();
			CarInDB.setEngine_number(car.getEngine_number());
			CarInDB.setColor(car.getColor());
			CarInDB.setOwner_name(car.getOwner_name());
			return "Data of the car with id number " + car.getId() + " is updated";
		}
	}
	
	public String deleteDataofCar(int id) {
		Optional<Car> optionalcar = carrepository.findById(id);

		if (optionalcar.isEmpty()) {
			return "Car with id number " + id + " is not in database";
		} else {
			carrepository.deleteById(id);
			return "Data of car with id number " + id + " is deleted";
		}
	}
	
}
