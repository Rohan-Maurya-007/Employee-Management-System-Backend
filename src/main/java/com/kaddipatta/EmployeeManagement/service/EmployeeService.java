package com.kaddipatta.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaddipatta.EmployeeManagement.dao.EmployeeDao;
import com.kaddipatta.EmployeeManagement.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public Employee saveEmployee(Employee employee) {
		return dao.saveUser(employee);
	}

	public List<Employee> fetchAllEmployee() {
		return dao.fetchAllEmployee();
	}

	public void deleteEmployee(long id) {
		dao.deleteEmployee(id);
	}

	public Optional<Employee> getemployeeById(long id) {
		return dao.getemployeeById(id);
	}

	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}
}
