package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService service;
	
	@GetMapping("/fetchStudent/{id}")
	public Student fetchStudent(@PathVariable("id") int id) {
		return service.fetchStudentFromAPIwithId(id);
	}
  
	@GetMapping("/fetchAllStudent")
	public List<Student> fetchStudent(){
		return service.fetchAllStudentFromAPI();
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		 return service.addStudentData(student);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudentData(id);
	}
}	