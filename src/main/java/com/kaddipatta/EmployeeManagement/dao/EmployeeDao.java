package com.kaddipatta.EmployeeManagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kaddipatta.EmployeeManagement.dto.Employee;
import com.kaddipatta.EmployeeManagement.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveUser(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> fetchAllEmployee(){
		return repository.findAll();
	}
	
	public void deleteEmployee(long id) {
		
		 repository.deleteById(id);
		
	}
	
	public Optional<Employee> getemployeeById(long id) {
		return repository.findById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}
	
}
