package com.class26;

public class Fulltime extends Employee {
int bonus;
	
	public void getPaid() {//overriding
		System.out.println("Full time EMployee gets paid "+salary+" and bonus "+bonus);
	}
}
