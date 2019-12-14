package com.class33;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


///*
//* Create an arrayList of drinks. 
//* If any drink has letter “a” or “e” replace it with water. 
//*/
public class HW3 {
public static void main(String[] args) {
	
	List<String> drinks=new ArrayList<>();
	drinks.add("cola");
	drinks.add("coffee");
	drinks.add("juice");
	drinks.add("inca kola");
	drinks.add("water");
	
	drinks.set(0, "water");
	System.out.println(drinks);
	for (int i=0; i<drinks.size(); i++){
		   if(drinks.get(i).contains("a")|| drinks.get(i).contains("e") ) {
	  	      	drinks.set(i, "water");
	  	       
	  	      }
	  	    } System.out.println(drinks);
	  	     
	  	    
	  	  }
}


