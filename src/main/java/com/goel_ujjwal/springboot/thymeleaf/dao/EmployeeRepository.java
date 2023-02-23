package com.goel_ujjwal.springboot.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goel_ujjwal.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// no need to write any code LOL!
	
	// method to sort by lastName
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
