package com.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repo.EmpRepository;

@Service
public class EmpService {

	@Autowired // creating a proxy object of interface
	EmpRepository emprepo;

	public String addEmpInDataBase(Employee emp) {
		// System.out.println(emprepo);
		// emprepo.save(emp);
		if (emprepo.findById(emp.getEid()).isPresent()) {
			return "Data of Person " + emp.getEid() + " is already added";
		}
		Employee saveobj = emprepo.save(emp);
		return "Data of the person " + saveobj.getName() + " added";
	}

	public Employee getEmpDataFromDB(Employee emp) {
		Optional<Employee> optionalEmp = emprepo.findById(emp.getEid());
		System.out.println(optionalEmp);
		Employee employee = optionalEmp.get();
		return employee;
	}

	@Transactional
	public String updateDataofEmp(Employee emp) {
		Optional<Employee> optionalEmp = emprepo.findById(emp.getEid());
		if (optionalEmp.isEmpty()) {
			return "Employee " + emp.getEid() + " is not a part of organization";
		} else {
			Employee employeeInDB = optionalEmp.get();
			employeeInDB.setName(emp.getName());
			employeeInDB.setSkills(emp.getSkills());
			employeeInDB.setAddr(emp.getAddr());
			return "Employee " + emp.getEid() + " data is updated";
		}
	}

	public String deleteDataofEmp(int id) {
		Optional<Employee> optionalEmp = emprepo.findById(id);

		if (optionalEmp.isEmpty()) {
			return "Employee " + id + " is not a part of organization";
		} else {
			emprepo.deleteById(id);
			return "Employee " + id + " data is deleted";
		}
	}

	//Data by skills
	public List<Employee> findEmpWithSkills(String skills) {
		List<Employee> e = emprepo.findBySkills(skills);
		return e;
	}

	//Data by Name
	public List<Employee> findEmpWithName(String name) {
		List<Employee> e = emprepo.findByName(name);
		return e;
	}

	//Data by Pattern of Strings
	public List<Employee> findEmpWithPattern(String name) {
		List<Employee> e = emprepo.findByNameLike(name);
		return e;
	}

	//showing Limited on single screen at a time
	public List<Employee> fetchAllEmpFromDB(int pagenumber) {
		Sort sortby = Sort.by("eid").ascending();
		PageRequest firstPagewithTwoRecords = PageRequest.of(pagenumber, 1);
		Page<Employee> empData = emprepo.findAll(firstPagewithTwoRecords);
		return empData.getContent();

	}

}
