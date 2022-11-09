package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.controller.Student;

@Service
public class ConsumerService {

	@Autowired
	RestTemplate restTemplate;
	
	public Student fetchStudentFromAPIwithId(int id) {
		Student student = restTemplate.getForObject("http://localhost:9090/student/{id}",Student.class,id);
		return student;
	}
	
	public List<Student> fetchAllStudentFromAPI(){
		List<Student> forObject = restTemplate.getForObject("http://localhost:9090/student",List.class);
	    return forObject;
	}

	public Student addStudentData(Student student) {
		Student st = restTemplate.postForObject("http://localhost:9090/student", student, Student.class);
		return st;
	}

	
	public String deleteStudentData(int id)  {
		try {
		restTemplate.delete("http://localhost:9090/student/{id}", id);
		}catch(HttpClientErrorException he) {
		    throw new  StudentNotFoundException("Student not available in database");
		}
		return "deleted";
	}
	
}
