package com.class7;

import java.util.Scanner;

public class Task2 {

	//BREAK AND CONTINUE
	public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Would you like to apply for CC?");        
	    String answer=scan.nextLine();
	    if(answer.equals("yes")) {
	        
	        break;
	    }
	        
	    
	    
	    }
	    }
	}
//create a program that will be asking user to apply for a credit card 10 times.
//As soon as you get a "yes"
//from a user, program should stop asking.no