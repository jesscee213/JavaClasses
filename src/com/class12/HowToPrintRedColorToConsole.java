package com.class12;

public class HowToPrintRedColorToConsole {
public static void main(String[] args) {
	
	// .contains();
	String sentence="It was raining";
	System.out.println(sentence.contains("Was"));
	
// .contains();
	//If this method sercheas the sequence of the characters in the tring
	//if the sentence of characters are found,
	//then it returns true otherwise returns false
	
	String sentence1="It was raining";
	String sen="raining";
	System.err.println(sentence.contains("Was"));
	System.out.println(sentence.contains("was"));
	
	//CREATE TWO STRINGS AND INITIALIZE THEM WITH SOME VALUE
	//IMPLEMENT THE FOLLOWING METHODS ON THOSE STRINGS.
	
//	* sen.length();
//	* sen.equals();
//	* sen.contains(s);
//	* sen.toUpperCase();
//	* sen.toLowerCase();
//	* sen.equalsIgnoreCase(anotherString);
	
	String sentence2="I love Java";
	System.out.println("Before :"+sentence2);
	sentence2=sentence2.toUpperCase();
	System.out.println("After ::"+sentence2);
	////////////////////////////////////////////////
	
	String str2="It is very Hot in here";
	System.out.println("if this string stars with="+str2.startsWith("It"));
	//System.out.println("if this string starts with
	
	System.out.println("if this string stars with="+str2.endsWith("Class"));

}
}