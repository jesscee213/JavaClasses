package com.class32;

import java.util.ArrayList;

public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("Jessica");
	arrayList.add("Maria");
	arrayList.add("Jose");
	arrayList.add("Viki");
	arrayList.add("Luis");
	
	//retrieve values from an arrayList
	//1- for loop
	 for (int i=0; i<arrayList.size(); i++) {
	 System.out.println(arrayList.get(i));
}
	 
	 System.out.println("**************************");
for (String name:arrayList) {
	System.out.println(name);
	 
}
}
}
