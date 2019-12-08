package com.class24;

public class Task1 {
    //Write a program  that will have a 4 different access levels of constructors 
	//and create 3 objects of this class:
	//1 - inside same class; 
	//2 - from outside the class and observe result. 
	//3 - from different class inside different package
	
	String name, lastName;
	private Task1 (String girlName, String girlLastName) {
		
	}
	public Task1(String girlName) {
		name=girlName;
		
	}
	protected Task1() {
		
	}
public void display() {
	System.out.println("My name is "+name+" "+lastName);
	
}
public static void main(String[] args) {
	Task1 obj= new Task1("Jessica", "Cabrera");
	
}
}
