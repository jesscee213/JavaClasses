package com.class08;

import java.util.Scanner;

public class whileLoop2 {

	//ask user to enter name 5 times and our output should be"
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	int i=5;
	while (i>10) {
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		System.out.println("Good afternoon "+name);
	}
}
}

