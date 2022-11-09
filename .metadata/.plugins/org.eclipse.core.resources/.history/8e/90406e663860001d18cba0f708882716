package com.example.DTO;

import com.example.entity.Employee;

public class EmployeeRequestDTO {

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
	
	public Employee convertEntity() {
		Employee employee = new Employee();
		employee.seteEmail(this.geteEmail());
		employee.seteId(this.geteId());
		employee.seteName(this.geteName());
		employee.seteSalary(this.geteSalary());
		employee.seteSalary(this.geteSalary());
		return employee;
	}
}
