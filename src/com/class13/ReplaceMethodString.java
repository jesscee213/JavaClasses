package com.class13;

public class ReplaceMethodString {
public static void main(String[] args) {
	
	// Relace Old char to a new Char. 
	
	String str="Hello Jessica How are you today";
	System.out.println(str.replace('o', 'z'));

String str1="Father Please Stretch My Hands Father";
System.out.println(str1.replace("Father Please", "Mother Hello"));
System.out.println(str1.replaceFirst("Father", "Mother"));// replacing only the FIRST duplicate father
}

}
