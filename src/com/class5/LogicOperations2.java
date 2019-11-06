package com.class5;

public class LogicOperations2 {
public static void main(String [] args) {
	String weekDay="Sunday";
	
	if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
		System.out.println("SDLC class");
	}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")){
	System.out.println("Java class");
	}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("No class");
	}else if (weekDay.equals("Wednesday") ){
		System.out.println("Review Class");
	}else {
		System.out.println("Not a valid day");
		
	}
}


int day=2;{

if (day==2 || day==4){
System.out.println("It is a weekday");
}else if (day==6 ||day==7) {
System.out.println("It is a weekend");
}else {
	System.out.println("not a valid day");
	
}
}
}
		