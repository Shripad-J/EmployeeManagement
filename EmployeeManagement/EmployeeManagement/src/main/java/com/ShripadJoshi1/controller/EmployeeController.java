package com.ShripadJoshi1.controller;

import java.util.List;

import com.ShripadJoshi1.entity.Employee;
import com.ShripadJoshi1.service.EmployeeService;

public class EmployeeController {
	
	EmployeeService service = new EmployeeService();
	
	public String insert(Employee employee) {
	 String msg = service.insert(employee);
	 return msg;
	}
	
	public Employee getEmployeeByID( int id) {
		Employee employeeByID = service.getEmployeeByID(  id);
		return employeeByID;
	}
	
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
	public String updateEmployee(int id, Employee employee) {
		return service.updateEmployee(id, employee);
	}
}
