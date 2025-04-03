package com.anu.string.sortingDemo.compareTo;

import java.util.Comparator;

import com.anu.string.sortingDemo.Student;

public class SortUsingComparatorWithNameDec  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	
		
		// i am using default method of string 
		return  - o1.getName().compareToIgnoreCase(o2.getName());
	}

}
