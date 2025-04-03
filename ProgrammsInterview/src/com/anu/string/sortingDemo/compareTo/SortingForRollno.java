package com.anu.string.sortingDemo.compareTo;

import java.util.Comparator;

import com.anu.string.sortingDemo.Student;

public class SortingForRollno implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int s1=o1.getId();
		int s2=o2.getId();
		return s2 -s1;
	}

	
	 
}
