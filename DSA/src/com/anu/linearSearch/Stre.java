package com.anu.linearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stre {
public static void main(String[] args) {
	
	
	
	
	
	
	
Map<Object, List<Emp>> 	es=getAll().stream().collect(Collectors.groupingBy(x->x.getName()));

System.out.println(es);
	/*forEach(x->{
		System.out.println("emp with name" +x.getName());
	});*/
	
}

private static List<Emp> getAll(){
	ArrayList<Emp> al=new ArrayList<Emp>();
	Emp e=new Emp(1, "anusha");
	Emp e1=new Emp(1, "ani");
	Emp e3=new Emp(10, "ani");
	Emp e4=new Emp(11, "ani");
	al.add(e1);
	al.add(e);
	al.add(e3);
	al.add(e4);
	return al;
}
}
