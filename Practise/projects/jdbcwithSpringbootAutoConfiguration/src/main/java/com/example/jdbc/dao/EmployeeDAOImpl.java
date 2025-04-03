package com.example.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.entity.Employee;
import com.example.jdbc.utility.AppConstants;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//public static final String EMP_DELETE = "  DELETE  FROM EMPLOYEE WHERE eid=?";

	@Override
	public Employee save(Employee emp) {

		// jdbcTemplate.update() method used to perform insert,update,delete
		// requirements
		// jdbcTemplate.execute() method used to create ,alter requirements

		try {
			jdbcTemplate.update(AppConstants.EMP_INSERT_QUERY, emp.getEid(), emp.getEname(), emp.getDept());
			
			System.out.println("DATA ADDED");
		} catch (Exception e) {
			System.out.println(e);
		}
		return emp;
	}

	@Override
	public Employee getById(int eid) {

		// queryForMap() : is used to get SINGLE record with map Object
		// QueryFORList()
		return jdbcTemplate.queryForObject(AppConstants.EMP_SELECTONE, (rs, rowNum) -> {
			return new Employee(rs.getInt("eid"), rs.getString("eName"), rs.getString("dept"));
		},eid);

	}

	@Override
	public Employee update(int eid, Employee emp ) {
		
		jdbcTemplate.update(AppConstants.EMP_UPDATE, emp.getEid(),emp.getEname(), emp.getDept(),eid);
		return emp;
	}

	@Override
	public String deleteById(int eid) {
		
	//	jdbcTemplate.update(EMP_DELETE);
		jdbcTemplate.update(AppConstants.EMP_DELETE, eid);

		//System.out.println("employee deleted Successfully" + eid);
		return "deleted record from database Successfully";
	}

	@Override
	public List<Employee> getAll() {
		return jdbcTemplate.query(AppConstants.EMP_GETALL, (rs, RowNum) -> {
			return new Employee(rs.getInt("eid"), rs.getString("eName"), rs.getString("dept"));
		});

	}

}
