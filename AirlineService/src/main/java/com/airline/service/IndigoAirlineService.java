package com.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dto.IndigoAirlineDTO;
import com.airline.entity.IndigoAirline;
import com.airline.repository.IndigoAirlineRepository;

@Service
public class IndigoAirlineService {
	
	@Autowired
	IndigoAirlineRepository airRepository;
	
	public IndigoAirline addDataToDataBase(IndigoAirlineDTO airlineDTO) {
	 IndigoAirline airline = null;
	 if(IndigoAirlineDTO.getSeatavailable() > 0) {
		 airline = airlineDTO.createEntity();
		 return airRepository.save(airline);
	 }
	 return null;
	}

}
