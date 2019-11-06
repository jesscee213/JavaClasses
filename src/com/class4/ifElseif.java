package com.class4;

public class ifElseif {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("NUm1 is larger than num2");

		} else if (num1 == num2) {
			System.out.println("Num1 is equal num2");
		} else {
			System.out.println("Num1 is smaller then num2");

		}

		int day = 4;
		if (day == 1) {
			System.out.println("today is monday, I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is tuesday. I have SDLC class");
		} else if (day == 3) {
			System.out.println("today is wednesday. I have Java review class");
		} else if (day == 4) {
			System.out.println("today is thursday. I have cycling class");
		} else if (day == 5) {
			System.out.println("Today is Friday. I have to work");
		} else if (day == 6) {
			System.out.println("Today is Saturday. I have Syntax");

		} else {
			System.out.println("I dont know what day it is");
			// command+shift+f

		}

	}

}
