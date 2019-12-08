package com.class24;

public class ThisWithConstructor {
ThisWithConstructor (){
System.out.println("I am a non argument constructor");


}
ThisWithConstructor(String str){
	this(); //used to call current class constructor
	System.out.println("I am a constructor with one string parameter");
	}
ThisWithConstructor(String str, String str1){
	this ("hello"); // always MUST be a first statement
	System.out.println("I am a constructor with TWO parameters");
}
public static void main(String[] args) {
	ThisWithConstructor obj=new ThisWithConstructor("Hello");
	ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Goodbye");
	
	
}


}
