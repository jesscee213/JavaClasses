package com.class4;

public class NestedIf {
	public static void main(String [] args) {
	
	boolean isFriday=true;
	int day=13;
	
	if (isFriday) 
		System.out.println("Today is Friday");
		if (day==13) {
			System.out.println("I will watch TV");
		
		}else {
			System.out.println("Today is  not Friday");
		}
	

	int age=15;
	if (age<16) {
	System.out.println("You are too young to drive");
	
	}else { 
		System.out.println("You are eligible to drive");
		
		if (age>=18) {
			System.out.println("You can drive alone");
		}else { 
			System.out.println("YOu need your parents to drive");
			
			
		}
			
	boolean quiz= false;
	int score=89;
	
	if(quiz) {
		System.out.println("Good Job");
		if(score>90) {
			System.out.println("You got a A");
		}else if (score>80) {
			System.out.println("You got a B");
		}else {
			System.out.println("you should study more!");
		}
		}else {
		System.out.println("not good");
			
				
			}
		}
	}
}


	

	

