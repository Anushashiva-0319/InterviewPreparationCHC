package com.example.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.entity.Employee;
import com.example.jdbc.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee  employee) {
		return	service.save(employee);
		//return "data Inserted successfully";
		
	}

	@PutMapping("/update/{eid}")
	public Employee updateEmployee(@PathVariable int eid, @RequestBody Employee  emp ) {
		return	service.update(eid,emp);
		//return "data Inserted successfully";
		
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return	service.getAll();
		//return "data Inserted successfully";
		
	}

	@GetMapping("/{eid}")
	public Employee getById(@PathVariable("eid") int eid) {
		return service.getById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable("eid") int eid) {
		 return service.deleteById(eid);
		  
	}
	
}
