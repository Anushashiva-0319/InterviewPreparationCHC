package com.anu.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "anus");
		Employee emp2 = new Employee(1, "anusha");

		
		  Map<Employee,String> map =new HashMap<Employee,String>(); map.put(emp1,
		  "anu"); map.put(emp2, "anu");
		  
		  System.out.println(map.size());
		 
		System.out.println(emp1.hashCode());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.hashCode());

		System.out.println(new Employee(3, "anusha").hashCode());
		System.out.println(new Employee(3, "anusha").hashCode());

	}

}

class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

}
