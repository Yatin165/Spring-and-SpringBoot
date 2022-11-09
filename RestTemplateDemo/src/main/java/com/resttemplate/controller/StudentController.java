package com.resttemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resttemplate.entity.Student;
import com.resttemplate.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stservice;

	@PostMapping("/student")
	public Student addData(@RequestBody Student student) {
		return stservice.addStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getStudent() {
		return stservice.getAllStudent();
	}
	
	@GetMapping("/student/{studentId}")
	public Student getStudentById(@PathVariable ("studentId") int id) {
		return stservice.getStudnetByStudentId(id);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		return stservice.deleteStudentById(id);
	}
	
}
