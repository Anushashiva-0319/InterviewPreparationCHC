package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapWithstreamOnCollectionObjects {
	
	public static void main(String[] args) {
		
		List<String> st =new ArrayList<>(Arrays.asList("suresh","anu","aji",null,"kavya","anu"));
	
	
	
		st.stream().filter(x->x!=null).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		
		
	}

}
