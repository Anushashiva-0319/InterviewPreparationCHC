package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMatchAnyMatchExamples {
public static void main(String[] args) {
	
	List<String> st =new ArrayList<>(Arrays.asList("apple","banana","bluea","mango")); //anyMatch()
	boolean anu=st.stream().anyMatch(x->x.startsWith("banana"));
	System.out.println(anu);
	
	boolean anu1=st.stream().allMatch(x->x.contains("a")); //allMatch()
	System.out.println(anu1);
	
}
}
