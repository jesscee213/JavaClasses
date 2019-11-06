package com.class6;

public class Homework {
	public static void main(String[] args) {
	int time=20;
	String timeOfday;
	
	if(time>=1 && time <=11) {
		timeOfday="Morning";
	}else if (time>=12 && time<15) {
		timeOfday="Noon";
	}else if (time>=16 && time <=20) {
		timeOfday="Evening";
	}else if (time>20 && time<=24) {
		timeOfday="Night";
	}else {
		timeOfday="Invalid";
	System.out.println("The time of the day is "+timeOfday);
	}
}
}


