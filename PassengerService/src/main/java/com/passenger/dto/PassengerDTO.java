package com.passenger.dto;

import com.passenger.entity.Passenger;

public class PassengerDTO {

	private int id;
	private String name;
	private int phoneNumber;
	AddressDTO addrdto;
	IndigoAirlineDTO airline;
	
	public IndigoAirlineDTO getAirline() {
		return airline;
	}
	public void setAirline(IndigoAirlineDTO airline) {
		this.airline = airline;
	}
	public AddressDTO getAddrdto() {
		return addrdto;
	}
	public void setAddrdto(AddressDTO addrdto) {
		this.addrdto = addrdto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
