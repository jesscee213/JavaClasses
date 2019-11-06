package com.class12;

public class StringManupulationDemo {
public static void main(String[] args) {
	//There are two ways to create a String object
	//1
	
	//String literal
	String name="John";
	System.out.println(name);
	System.out.println("The length of John's name is "+name.length());
	
	//2
	//Creating String with new keyword
	
	String name1=new String ("John1");
	System.out.println(name1);
	
	//This Method returns the length of this string'//The length is equal to the number 
	//of 16 bit Unicode characters  in the string
	
	int name1Len=name1.length();
	System.out.println("The Length of name1 is "+name1Len);
	
	System.out.println("**********************");
	
	String str1="Hello World";
	System.out.println("Before::"+str1);
	str1=str1.toLowerCase();
	System.out.println("After::"+str1);
	
	System.out.println("***********************");
	
	//.equals()
	//THIS METHOD WILL COUNT EVERYTHING SUCH AS CAPITALIZATION AND CONTENT
	String str2="Hello World";
	
	boolean isEqual=str1.equals(str2);
	System.out.println(isEqual);
	
	//.equalsIgnoreCase
	
	System.out.println(str1.equalsIgnoreCase(str2));
	
	String str3="Jessica";
	System.out.println("Before ::"+str3);
			str3=str3.toUpperCase();
			System.out.println("After ::"+str3);
			
	
}
}
