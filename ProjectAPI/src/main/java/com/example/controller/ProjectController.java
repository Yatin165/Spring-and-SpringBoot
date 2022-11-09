package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Project;
import com.example.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/project")
	public String addData(@RequestBody Project project) {
		return projectService.addProject(project);
	}
	
	@GetMapping("/project/{id}")
	public Object getprojectById(@PathVariable int id) {
		return projectService.getProjectByProjectId(id);
	}
	
	@PutMapping("/project")
	public String updateproject(@RequestBody Project project) {
		return projectService.updateDataofProject(project);
	}
	
	@DeleteMapping("/project/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return projectService.deleteProjectById(id);
	}
	
//	@PutMapping("/assignEmpToProject")
//	public ResponseEntity<Project> assignEmpToProject(int projectId,int employeeId) {
//		Project assignEmp = projectService.assignEmp(projectId,employeeId);
//	    return new ResponseEntity<Project>(assignEmp,HttpStatus.CREATED);
//	}
}
