package com.class7;

public class Loop3 {
	public static void main(String[] args) {
	boolean workDay=true;
	int day=1;
	while(day<8) {
	    if(workDay&&day<6) {
	        System.out.println("I need a day of");
	    }else {
	        System.out.println("I dont need a day of");
	    }day++;
	}
	}
}
//Create a boolean variable workDay and assign true create int variable day and assign it to 1

//As long as it is workDay print “I need a day off” and increase day.
//Once day is 6 or 7 print “I do not need a day off any more”
//while works while condition is true