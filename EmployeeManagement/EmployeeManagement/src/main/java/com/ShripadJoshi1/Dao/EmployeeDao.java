package com.ShripadJoshi1.Dao;

 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import com.ShripadJoshi1.config.hibernateConfig;
import com.ShripadJoshi1.entity.Employee;
 

public class EmployeeDao {
	
	  SessionFactory sf = hibernateConfig.getSessionFactory();
	
	  public String insertEmployee(Employee employee) {
		
		  Session session= sf.openSession();
		  Transaction tr = session.beginTransaction();
		 
		 session.save(employee);
		 
		 tr.commit();
		 session.close();
		 
		 return "Employee insert successfully.....";
	}
	
	public Employee getEmployeeByID(int id) {
		
		Session openSession = sf.openSession();
		Employee employee1= openSession.get(Employee.class, id);
		return employee1;
	}
	
	public List<Employee> getAllEmployee() {
		Session session = sf.openSession();
		
		List<Employee> employee = session.createQuery("From Employee").setFirstResult(2).setMaxResults(3).list();
		
		return employee;
	}
	
	  public String updateEmployee(int id, Employee employee) {
			
		  Session session= sf.openSession();
		  Transaction tr = session.beginTransaction();
		  
		  Employee existingEmployee = session.get(Employee.class, id);
		  if (existingEmployee != null) {
		        existingEmployee.setName(employee.getName());
		        existingEmployee.setSalary(employee.getSalary());
		    } else {
		        return "Employee not found";
		    }
		 
		  
		 tr.commit();
		 session.close();
		 
		 return "Employee updated successfully.....";
	}
	   
	
	
}
