package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {
public static void main(String[] args) {
	
	
	List<String> st =new ArrayList<>(Arrays.asList("suresh","anu","aji","suresh","kavya","anu"));
	st.stream().filter(n->n.equalsIgnoreCase(n)).forEach(x->System.out.println(x));
	
	//System.out.println(count);
}
}
