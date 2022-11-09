package com.springboot.empcontroller;

import java.util.List;

import org.json.JSONObject;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmpService;

@RestController
public class Empcontroller {

	@Autowired
	EmpService empservice;

	@PostMapping("/emp")
	public String addEmp(@RequestBody Employee emp) {
		// empservice.addEmpInDataBase(emp);
		String message = empservice.addEmpInDataBase(emp);
		return message;
	}

/*	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable int id) {
		return empservice.getEmpDataFromDB(id);
	}*/

	@GetMapping("empbyskills") // get data by skills
	public List<Employee> getEmpDataBySkills(String skills) {
		return empservice.findEmpWithSkills(skills);
	}

	@GetMapping("empbyname") // get data by Name
	public List<Employee> getEmpDataByName(String name) {
		return empservice.findEmpWithName(name);
	}

	@GetMapping("/emp") //get data by Id
	public Employee getEmpDataById(Employee emp) {
		return empservice.getEmpDataFromDB(emp);
	}

	@GetMapping("/emplike") // get data by pattern of strings
	public List<Employee> getEmpDataByPattern(@RequestBody String pattern) {
		JSONObject json = new JSONObject(pattern);
		String pa = json.getString("pattern");
		return empservice.findEmpWithPattern(pa);
	}

	@GetMapping("/allEmp") // Fetching all entries on a page
	public List<Employee> fetchAllEmp(int pagenumber) {
		return empservice.fetchAllEmpFromDB(pagenumber);
	}

	@PutMapping("emp")
	public String updateEmp(@RequestBody Employee emp) {
		return empservice.updateDataofEmp(emp);
	}

	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable int id) {
		return empservice.deleteDataofEmp(id);
	}

	/*
	 * public List<Employee> fetchAllEmp(@PathVariable int id) { return
	 * empservice.fetchEmpFromDB(id); }
	 */

	// public List<Employee> fetch

}
