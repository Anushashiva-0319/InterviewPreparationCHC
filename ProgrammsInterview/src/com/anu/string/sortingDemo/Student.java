package com.anu.string.sortingDemo;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String address;
	private int marks;

	public Student(int id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

//************************************************************************//

	// here i am sorting my custom object using the comparable interface of method
	// is compareTo

	// here sorting in descending order

	@Override
	public int compareTo(Student o) {
		return -this.getName().compareToIgnoreCase(o.getName());

	}

}
