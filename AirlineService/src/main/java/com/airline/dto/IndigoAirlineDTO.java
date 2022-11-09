package com.airline.dto;

import com.airline.entity.IndigoAirline;

public class IndigoAirlineDTO {//Data Transfer Object
 
	private static int seatnumber = 100;
	private int flightnumber;
	private int passengernumber;
	private static int seatavailable = 5;
	private String origin;
	private String destination;
	
	
	public int getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(int flightnumber) {
		this.flightnumber = flightnumber;
	}
	public int getPassengernumber() {
		return passengernumber;
	}
	public void setPassengernumber(int passengernumber) {
		this.passengernumber = passengernumber;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public IndigoAirline createEntity() {
		IndigoAirline indigo = new IndigoAirline();
		indigo.setSeatnumber(seatnumber);
		seatnumber++;
		indigo.setDestination(this.getDestination());
		indigo.setFlightnumber(this.getFlightnumber());
		indigo.setOrigin(this.getOrigin());
		indigo.setPassengernumber(this.getPassengernumber());
	    seatavailable--;
	    return indigo;
	}
	public static int getSeatavailable() {
		return seatavailable;
	}
	public static void setSeatavailable(int seatavailable) {
		IndigoAirlineDTO.seatavailable = seatavailable;
	}
	
}
