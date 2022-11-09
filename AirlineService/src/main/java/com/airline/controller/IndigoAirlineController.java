package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.IndigoAirlineDTO;
import com.airline.entity.IndigoAirline;
import com.airline.service.IndigoAirlineService;

@RestController
public class IndigoAirlineController {

	 @Autowired
     IndigoAirlineService airlineservice;
	 
	 @PostMapping("airline")
	 public IndigoAirline addData(@RequestBody IndigoAirlineDTO airlineDTO) {
		return airlineservice.addDataToDataBase(airlineDTO);
	 }
}
