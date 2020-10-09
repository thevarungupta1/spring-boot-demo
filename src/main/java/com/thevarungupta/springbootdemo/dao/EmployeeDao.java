package com.thevarungupta.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thevarungupta.springbootdemo.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	

	
	
}
