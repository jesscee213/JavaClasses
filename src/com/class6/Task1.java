package com.class6;

import java.util.Scanner;

public class Task1 {

	
public static void main(String[] args) {
String month;

Scanner scan=new Scanner(System.in);
System.out.println("Which month were you born");
month=scan.nextLine();
if (month.equals("January") || month.equals("February") || month.equals("December")){
	month="Winter";
}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
	month="Spring";
}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
	month="Summer";
}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
		month="Fall";
	}else {
		month="unknown";
	
	}
}
}

