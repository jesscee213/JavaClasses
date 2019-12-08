package com.class25_1;

public class Task2 {
	public static void foodNames() {
		System.out.println("I like to eat ceviche");
	}
	
	public static void foodNames(String str) {
		System.out.println("I like to eat "+str);
	}
	//can we overload a main method? - Yes
	//can we overload a static method? - Yes
	
	
	public static void main (String str, String[] arg) {
		System.out.println("I like to eat "+str);
	}
	
	public static void main(String[] args) {
		System.out.println("I like to eat different types of food");
		CanWeOverload.main("String");
		String[] array= {"A", "B"};
		main("Soup", array);
	}
}
