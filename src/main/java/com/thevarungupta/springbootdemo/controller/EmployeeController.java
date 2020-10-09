package com.thevarungupta.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thevarungupta.springbootdemo.entities.Employee;
import com.thevarungupta.springbootdemo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		return this.employeeService.getEmployee(empId);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	
	
	
	
	
	
	
}
