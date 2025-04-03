package com.ex.stream.onCollectionObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamDuplicates {

	
	public static void main(String[] args) {
		
		
		List<String> list =new ArrayList<>(Arrays.asList("anusha","aji","kavi","anusha","pesi"));
		
		Set<String> set =new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(x->System.out.println(x));
		
		
	}
	
}
