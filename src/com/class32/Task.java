package com.class32;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("Jessica");
	arrayList.add("Maria");
	arrayList.add("Jose");
	arrayList.add("Viki");
	arrayList.add("Luis");
	System.out.println(arrayList.isEmpty());
	System.out.println(arrayList.contains("Jessica"));
	System.out.println(arrayList.size());
	System.out.println(arrayList);
	System.out.println(arrayList.get(4));
}
}
