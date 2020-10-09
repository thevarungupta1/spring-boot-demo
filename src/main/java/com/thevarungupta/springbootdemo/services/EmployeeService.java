package com.thevarungupta.springbootdemo.services;

import java.util.List;

import com.thevarungupta.springbootdemo.entities.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public Employee getEmployee(int empId);
	public Employee addEmployee(Employee newEmployee);
//	public Employee updateEmployee(Employee updateEmployee);
//	public void deleteEmployee(int empId);

}
