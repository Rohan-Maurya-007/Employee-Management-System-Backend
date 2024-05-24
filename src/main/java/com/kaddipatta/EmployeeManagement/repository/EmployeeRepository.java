package com.kaddipatta.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaddipatta.EmployeeManagement.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
