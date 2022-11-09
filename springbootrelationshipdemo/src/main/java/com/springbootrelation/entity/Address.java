package com.springbootrelation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Address {
	
	@Id
	private String addrid;
	private String city;
	private String state;
	private int pincode;
	
	
	public String getAddrid() {
		return addrid;
	}
	public void setAddrid(String addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
