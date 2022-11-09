package com.passenger.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.passenger.dto.IndigoAirlineDTO;
import com.passenger.dto.PassengerDTO;
import com.passenger.entity.Passenger;
import com.passenger.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	RestTemplate restTemplate;
	

	public Passenger addDataToDatabase(Passenger payload) {
	        return passengerRepository.save(payload);

	}
	

	public Passenger getDataFromDatabase(int id) {
		Optional<Passenger> optionalobject = passengerRepository.findById(id);
		Passenger passenger = optionalobject.get();
		return passenger;
	}

	@Transactional
	public String updateDataInDatabase(Passenger payload) {
		Optional<Passenger> optional = passengerRepository.findById(payload.getId());
		if (optional.isEmpty()) {
			return "Passenger " + payload.getId() + " not in database";
		} else {
		    Passenger passengerInDB = optional.get();
			passengerInDB.setName(payload.getName());
			passengerInDB.setPhoneNumber(payload.getPhoneNumber());
			return "Data Updated";
		}
	}

	public String deleteDataFromDatabase(int id) {
		Optional<Passenger> optional = passengerRepository.findById(id);

		if (optional.isEmpty()) {
			return "Passenger " + id + " is not in database";
		} else {
			passengerRepository.deleteById(id);
			return "Passenger " + id + " data is deleted";
		}
	}

	String url = "http://localhost:8080/airline";
	
	
	public PassengerDTO bookMyFlightTicket(int passengernumber, int flightnumber, String origin, String destination) {
    Optional<Passenger> optPassenger = passengerRepository.findById(passengernumber);
	if(optPassenger.isPresent()) {
		Passenger passenger = optPassenger.get();
		PassengerDTO passengerDTO = passenger.convertToDTO(passenger);
		IndigoAirlineDTO indiDTO = new IndigoAirlineDTO();
		indiDTO.setPassengernumber(passengernumber);
		indiDTO.setFlightnumber(flightnumber);
		indiDTO.setDestination(destination);
		indiDTO.setOrigin(origin);
		IndigoAirlineDTO postForObject = restTemplate.postForObject(url, indiDTO, IndigoAirlineDTO.class);
	    passengerDTO.setAirline(postForObject);
	    return passengerDTO;
	}
	return null;
	}
}
