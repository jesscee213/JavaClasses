package com.class15;

public class StringManipulationTaskl {
	 public static void main(String[] args) {
	        //get a character at specific location
	        String str="Syntax Technologies Inc";
	        
	        char letter=str.charAt(5); // print out letter x
	        System.out.println(letter);
	        //length =19
	        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
	        System.out.println(str.charAt(str.length()-1)); //print last letter 
	        System.out.println(str.length());
	        //get a substring from a String
	        //Syntax
	        String substr1=str.substring(0, 6); //print out syntax
	        System.out.println(substr1);
	        //Technologies Inc
	        String substr2=str.substring(7); //print out everything after Technologies
	        System.out.println(substr2);
	 }
}
