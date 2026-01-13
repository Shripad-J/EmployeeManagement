package com.ShripadJoshi1.main;

import java.util.List;

import com.ShripadJoshi1.controller.EmployeeController;
import com.ShripadJoshi1.entity.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		EmployeeController cc = new EmployeeController();
		
//		String msg = cc.insert(new Employee(1,  "Shripad", 120000));
//		String msg = cc.insert(new Employee(2,  "Aditya", 110000));
//		String msg = cc.insert(new Employee(3,  "abhishek", 100000));
//		System.out.println(msg);
//		
//		Employee employeeByID = cc.getEmployeeByID(2);
//		
//		System.out.println("name :- " + employeeByID.getName());
//		System.out.println("salary :- " +employeeByID.getSalary());
//		
//		
		List<Employee> allEmployee = cc.getAllEmployee();
//		
		for (Employee employee : allEmployee) {
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			
			System.out.println("--------------------------------------");
		}
//		
//		Employee employee = new Employee();
//		employee.setName("rushi");
//		employee.setSalary(20000);
//		
//		String msg = cc.updateEmployee(3, employee);
//		System.out.println(msg);
//		
		
	}

}
