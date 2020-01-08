package com.class35;

import java.util.HashMap;

public class MapIntro {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	//to store key+value pair into map
	map.put(101, "John");
	map.put(102, "Jack");
	map.put(103, "Jane");
	map.put(104, "Jenny");
	System.out.println(map);
	
	//how to verify if there are any elements inside map
	
	boolean flag=map.isEmpty();
			if (!flag) {
				int size=map.size();
				
			}
			//I want to add more Entry Objects
			map.put(105, "John");
			System.out.println(map);
			
			//adding duplicates-->override, we cannot have duplicate keys
			map.put(102, "Hasan");
			System.out.println(map);
			
			//HOw to access value
			String mapElement=map.get(105);
			System.out.println(mapElement);
			//to replace or update value
			map.replace(103, "Jessica");
			System.out.println(map);
			
			//how to remove an Object from a map
			map.remove(101);
			System.out.println(map);
			
			boolean flag1=map.containsKey(103);
			if (flag1) {
				map.replace(103,"Penelope" );
			}else {
				map.put(103, "Penelope");
				
			}
			boolean contains=map.containsValue("Penelope");
			System.out.println(contains);
			System.out.println(map);
}
}
