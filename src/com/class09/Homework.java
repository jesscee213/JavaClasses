package com.class09;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
	
	
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter a start number: ");
	int s=sc.nextInt();
	System.out.print("Enter a end number: ");
	int e=sc.nextInt();

	int sumEven=0;
	int sumOdd=0;


	for( int i=s; i<=e ;i++) {

	  if(i%2==0) {    
	    
	  sumEven=sumEven+i;
	  

	}else {
	    sumOdd=sumOdd+i;
	        
	     }
	}    
	 System.out.println(sumEven);
	 System.out.println(sumOdd);
	 }
	 
	 }

//Write a program that reads a range of integers (start and end point), 
//provided by a user and then from that range prints the sum of the even and odd integers.
