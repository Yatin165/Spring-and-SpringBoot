package com.example.DTO;

public class EmployeeDTO {

	private int eId;
	private String eName;
	private int eSalary;
	private String eSkill;
	private String eEmail;
	ProjectDTO projectDTO;
	
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
	public ProjectDTO getProjectDTO() {
		return projectDTO;
	}
	public void setProjectDTO(ProjectDTO projectDTO) {
		this.projectDTO = projectDTO;
	}
	
}
