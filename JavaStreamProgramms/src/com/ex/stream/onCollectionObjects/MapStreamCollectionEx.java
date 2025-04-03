package com.ex.stream.onCollectionObjects;

import java.util.HashMap;
import java.util.Map;

public class MapStreamCollectionEx {
public static void main(String[] args) {
	
	Map<String ,Integer> hm= new HashMap<>();
	hm.put("anusha", 1);
	hm.put("aji", 2);
	hm.put("anusha", 3);
	
	hm.entrySet().stream().forEach(x->System.out.println(x));
	
	
}
}
