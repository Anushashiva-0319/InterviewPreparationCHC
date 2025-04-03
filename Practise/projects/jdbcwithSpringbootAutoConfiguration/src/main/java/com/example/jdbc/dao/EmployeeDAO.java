package com.example.jdbc.dao;

import java.util.List;

import com.example.jdbc.entity.Employee;


public  interface EmployeeDAO  {
	
	
		public Employee save(Employee emp);
		public Employee update(int eid,Employee emp);

		public Employee getById(int eid);
		public String deleteById(int eid);
		
		public List<Employee> getAll();

		
	
	
	
	
	

}
