package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.DTO.EmployeeDTO;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String eName;
	private int eSalary;
	private String eSkill;
	private String eEmail;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String geteSkill() {
		return eSkill;
	}
	public void seteSkill(String eSkill) {
		this.eSkill = eSkill;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public EmployeeDTO convertToDTO(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.seteEmail(employee.geteEmail());
		employeeDTO.seteName(employee.geteName());
		employeeDTO.seteSalary(employee.geteSalary());
		employeeDTO.seteSalary(employee.geteSalary());
		return employeeDTO;
	}
	

}
