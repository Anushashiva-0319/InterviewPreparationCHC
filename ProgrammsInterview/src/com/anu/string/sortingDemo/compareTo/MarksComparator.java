package com.anu.string.sortingDemo.compareTo;

import java.util.Comparator;

import com.anu.string.sortingDemo.Student;

public class MarksComparator implements Comparator<Student> {

	// I want to sort my student by marks using own logic

	@Override
	public int compare(Student stu, Student anotherStu) {
		
		
		//sort student objects based on marks
	
	int mark =stu.getMarks();
	int mark2=anotherStu.getMarks();
	
	//return mark - mark2;   // for ascending order
		
		return mark2 -mark;   // for descending order
		
	}
	
	
	

}
