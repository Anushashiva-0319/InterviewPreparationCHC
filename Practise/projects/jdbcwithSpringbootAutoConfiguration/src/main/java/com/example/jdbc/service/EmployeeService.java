package com.example.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbc.dao.EmployeeDAO;
import com.example.jdbc.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	public Employee save(Employee emp) {

		return dao.save(emp);

	}

	public  Employee getById(int eid) {
		
		
		return dao.getById(eid);
	}

	public String deleteById(int eid) {
		 return dao.deleteById(eid);
	}

	public Employee update( int eid,Employee emp ) {
		return dao.update(eid,emp);
	}

	public List<Employee> getAll() {
		return dao.getAll();
	}
}
