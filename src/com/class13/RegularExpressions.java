package com.class13;

public class RegularExpressions {
public static void main(String[] args) {
	
	//PRINT ONLY TEXT AND NOT NUMBERS	
	String str="21324kjLPdjl43lkj54l34";
	System.out.println(str.replaceAll("[0-9]","")); 
 System.out.println(str.replaceAll("[^0-9]", "")); //// [^0-9]- remove letters [0-9] remove numbers
	System.out.println(str.replaceAll("[a-zA-Z]","")); //Leave numbers, but remove lower case and upper case
 
	// remove everything except text and numbers
	
	String str2="dakljess$%%%76768$%%";
	System.out.println(str2.replaceAll("[^a-zA-z0-9]", ""));
	System.out.println(str2.replaceAll("[^jess]", "") );
	
	String str1="02/13/1989";
	System.out.println(str1.replaceAll("/", "-")); 
	System.out.println(str1.replaceFirst("/", "-"));
System.out.println(str1.replace('/', '-'));
}}