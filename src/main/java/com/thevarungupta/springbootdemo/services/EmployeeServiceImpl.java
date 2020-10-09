package com.thevarungupta.springbootdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thevarungupta.springbootdemo.dao.EmployeeDao;
import com.thevarungupta.springbootdemo.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//List<Employee> list;
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Employee(100, "Mark", "m@gmail.com"));
//		list.add(new Employee(200, "Paul", "p@gmail.com"));
//		list.add(new Employee(300, "Watson", "w@gmail.com"));
	}
	
	@Override
	public List<Employee> getEmployees() {
		//return list;
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int empId) {
//		Employee employee = null;
//		for(Employee emp: list) {
//			if(emp.getEmpId()==empId) {
//				employee = emp;
//				break;
//			}
//		}
//		return employee;
		return employeeDao.getOne(empId);
	}

	@Override
	public Employee addEmployee(Employee newEmployee) {
//		list.add(newEmployee);
//		return newEmployee;
		employeeDao.save(newEmployee);
		return newEmployee;
	}

	

}
