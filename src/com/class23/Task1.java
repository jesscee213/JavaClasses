package com.class23;

public class Task1 {

//Write a program that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	
	Task1(String str){
		System.out.println("This is Task1 with parameter");
	}
	
	Task1(){
		System.out.println("This is Task number one with no parameter");
		
	}
	
	public static void main(String[] args) {
		Task1 obj=new Task1();
		Task1 obj2=new Task1("String");
	}
}