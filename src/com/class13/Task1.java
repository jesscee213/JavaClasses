package com.class13;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
	System.out.println("Enter your class day::");
	String day=scanner.nextLine();
	
	if (day.equals("Saturday")) {
	System.out.println("Saturday is your Java Class");
	}else if (day.equals("Sunday")) {
	System.out.println("SUnday is your GIT class");
}else if (day.equals("Tuesday")) {
	System.out.println("Tuesday is your SDLC class");
}else if (day.equals("Thursday")) {
	System.out.println("Thursday is your MAnual Testing class");
}else {
	System.err.println("Invalid Entry!!! please enter a valid class day");
	}
	
	
	
    
}
}

