package com.resttemplate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resttemplate.entity.Student;
import com.resttemplate.exception.StudentNotAvailableException;
import com.resttemplate.repositroy.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepo;

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Student getStudnetByStudentId(int Id) {
		Optional<Student> optionalStudent = studentRepo.findById(Id);
		Student orElseThrow = optionalStudent.orElseThrow(()-> new StudentNotAvailableException("Student is not available") );
	    return orElseThrow;
	}
	
	public List<Student> getAllStudent(){
		List<Student> student = (List<Student>)studentRepo.findAll();
		return student;
	}
	
	public String deleteStudentById(int id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student orElseThrow = findById.orElseThrow(()-> new StudentNotAvailableException("Studnet you are trying to delte is not available") );
	    studentRepo.deleteById(id);
	    return "deleted";
	}
}
