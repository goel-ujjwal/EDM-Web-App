package com.goel_ujjwal.springboot.thymeleaf.service;

import java.util.List;

import com.goel_ujjwal.springboot.thymeleaf.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
