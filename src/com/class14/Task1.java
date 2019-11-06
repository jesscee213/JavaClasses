package com.class14;

public class Task1 {
//	Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	
public static void main(String[] args) {
	String str="Hello My Name Is Jessica";
	System.out.println(str.replace(" ", ""));

	
//	Create a String that should be combination of letters, 
	//numbers and special characters. Find out how many alpha characters are there in the String.
String str1="dkjksd*&78&5675GHghgas";
String str3=str1.replaceAll("[^a-zA-z]", "");
System.out.println(str3.length());

	
	
	//	You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?”
//How would you find out how many sentences are in that String?

String str2="Is it Saturday? Is it raining? Do we have a Java Class today?";
String [] array2=str2.split("\\?");
System.out.println("The number of sentences is: " +array2.length);




}
}
