package com.ex.stream.codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByExample {
	public static void main(String[] args) {

		List<Student> stu = new ArrayList<>();
		stu.add(new Student(1, "mca", "10000"));
		stu.add(new Student(2, "mba", "9000"));
		stu.add(new Student(3, "mca", "100000"));
		stu.add(new Student(4, "mba", "9000"));

		// groupingByDept
		Map<String, List<Student>> stude = stu.stream().collect(Collectors.groupingBy(s -> s.getDept()));

		System.out.println(stude);
		
		// grouping by salary
	Map<String, List<Student>> salList=	stu.stream().collect(Collectors.groupingBy(x->x.getSal()));
	System.out.println(salList);
	}

}

class Student {
	private int id;
	private String dept;
	private String sal;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", dept=" + dept + ", sal=" + sal + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public Student(int id, String dept, String sal) {
		super();
		this.id = id;
		this.dept = dept;
		this.sal = sal;
	}

}