package com.kaddipatta.EmployeeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaddipatta.EmployeeManagement.dto.Employee;
import com.kaddipatta.EmployeeManagement.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:1234/")
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/Employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/Employee")
	public List<Employee>  fetchAllEmployee() {
		return service.fetchAllEmployee();
	}
	
	@DeleteMapping("/Employee/{id}")
	public void deleteEmployee(@PathVariable long id) {
		service.deleteEmployee(id);
	}
	
	@PatchMapping("/Employee/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@GetMapping("/Employee/{id}")
	public Optional<Employee> getemployeeById(@PathVariable long id){
		return service.getemployeeById(id);
	}
	
	
}
