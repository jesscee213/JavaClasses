package com.class13;

public class Recap2 {
public static void main(String[] args) {
	 String str1="Hello";
	 String str2="Hello";
	 System.out.println(str1.equals(str2)); //TRUE
	 System.out.println(str1.equalsIgnoreCase(str2));
	 
	 String str3=new String("Bye");
	 String str4=new String("Bye");
	 System.out.println(str3.equals(str4)); //TRUE
	 System.out.println(str3==str4); //FALSE
}
}
