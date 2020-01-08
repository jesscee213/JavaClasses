package com.class35;

import java.util.HashMap;

public class MapTask1 {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	map.put(1,"Google");
	map.put(2, "Syntax");
	map.put(3, "Apple");
	map.put(4, "Amazon");
	map.put(3,"Apple" );
	map.put(2, "Syntax");
	map.put(1, "Deloitte");
	
	System.out.println(map.size());
	
	map.replace(4, "CACI");
	System.out.println(map);
	
	map.remove(7);
	System.out.println(map);
}
}
