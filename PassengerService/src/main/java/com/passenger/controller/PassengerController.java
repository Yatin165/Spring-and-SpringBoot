package com.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.dto.PassengerDTO;
import com.passenger.entity.Passenger;
import com.passenger.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	PassengerService passengerservice;
	
	@PostMapping("/passenger")
	public Passenger addData(@RequestBody Passenger payload) {
		return passengerservice.addDataToDatabase(payload);
	}
	
/*	@GetMapping("/passenger")
	public Passenger getData(int id) {
		return passengerservice.getDataFromDatabase(id);
	}*/
	
	@GetMapping("/passenger")
	public PassengerDTO bookMyTicket(int passengernumber, int flightnumber, String origin, String destination) {
		return passengerservice.bookMyFlightTicket(passengernumber,flightnumber,origin,destination);
	}
	
	@PutMapping("/passupdate")
	public String updateData(@RequestBody Passenger payload) {
		return passengerservice.updateDataInDatabase(payload);
	}
	
	@DeleteMapping("/passdelete")
	public String deleteData(int id) {
		return passengerservice.deleteDataFromDatabase(id);
	}

}