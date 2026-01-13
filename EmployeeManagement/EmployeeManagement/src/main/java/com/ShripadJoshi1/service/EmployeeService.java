package com.ShripadJoshi1.service;

import java.util.List;

import com.ShripadJoshi1.Dao.EmployeeDao;
import com.ShripadJoshi1.entity.Employee;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDao();
	
	public String insert(Employee employee) {
		String msg =dao.insertEmployee(employee);
		return msg;
	}
	
	public Employee getEmployeeByID( int id) {
		Employee employeeByID = dao.getEmployeeByID( id);
		return employeeByID;
	}
	
	public List<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
	
	public String updateEmployee(int id, Employee employee) {
		return dao.updateEmployee(id,employee);
	}

}
