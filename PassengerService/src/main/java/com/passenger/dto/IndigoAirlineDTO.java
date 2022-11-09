package com.passenger.dto;

public class IndigoAirlineDTO {

	private int seatnumber;
	private int flightnumber;
	private int passengernumber;
	private String origin;
	private String destination;
	
	
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
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
}
