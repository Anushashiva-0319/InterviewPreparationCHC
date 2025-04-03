package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.List;

public class TerMinalOperation {
public static void main(String[] args) {
	
	
	
	List<Integer> num=new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(2);
	num.add(3);
	num.add(2);
	
	Integer z= num.stream().findFirst().get(); // it give first element of given list
	System.out.println(z);
	
	
	// findAny()
	Integer c=num.stream().findAny().get();
	System.out.println(c);
}
}
