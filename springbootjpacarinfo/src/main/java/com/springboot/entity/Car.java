package com.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "Car_Information_Storage")
public class Car {
	
	@Id
	private int id;
	private String regnumber;
	private String engine_number;
	private String owner_name;
	private String color;
	private String manufacturer;
	
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", regnumber=" + regnumber + ", engine_number=" + engine_number + ", owner_name="
				+ owner_name + ", color=" + color + ", manugacturer=" + manufacturer + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegnumber() {
		return regnumber;
	}
	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}
	public String getEngine_number() {
		return engine_number;
	}
	public void setEngine_number(String engine_number) {
		this.engine_number = engine_number;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manugacturer) {
		this.manufacturer = manugacturer;
	}

}
