package com.class5;

import java.util.Scanner;

public class LogicalNot {

	public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Do you need a loan?");
		  boolean credit=scan.nextBoolean();
		  
		
		  if (credit) {
			  System.out.println("What is your credit score");
		  int score=scan.nextInt();
		  
		
		  if (score<600) {
		  System.out.println("Not eligible");
		}else if(score>600 && score<=700){
		  System.out.println("Maybe eligible");
		}else if (score>=701 && score<=800){
		  System.out.println("Eligible");
		}else if (score>801){
		  System.out.println("Definitly eligible");
		}else {
		  System.out.println("Unknown");
	System.out.println("The eligibility is "+score);
		}
		}
		}	
}



