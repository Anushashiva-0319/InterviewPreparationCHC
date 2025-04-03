package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNullValuesfronArrayListUsingstream {

	
	public static void main(String[] args) {
		
		List<String> st =new ArrayList<>(Arrays.asList("suresh","anu","aji",null,"kavya","anu"));
		
		st.stream().filter(x->x!=null).forEach(x->System.out.println(x)); // without null
		
		st.stream().filter(x->x!=null).distinct().forEach(x->System.out.println(x)); //without null and duplicates
	System.out.println("###########################################");
		//remove nulls and duplicates and get sortedOrder
	
		st.stream().filter(x->x!=null).distinct().sorted().forEach(x->System.out.println(x));
	}
}
