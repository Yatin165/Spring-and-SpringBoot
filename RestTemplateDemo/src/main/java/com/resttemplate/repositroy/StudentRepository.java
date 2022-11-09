package com.resttemplate.repositroy;

import org.springframework.data.repository.CrudRepository;

import com.resttemplate.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
