package com.class3;

public class RelationalOperators {
public static void main(String[] args) {
	double d=1.99;
	double d1=2.99;
	
	boolean b5=d>d1;
	System.out.println(b5);
	
	boolean b1=d<d1;
	boolean b2=d==d1;
	boolean b3=d!=d1;
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	int a=90;
	int b=300;
	//if numebr a is bigger than b
	//I want to print a is larger then b
	//else=otherwise
	
	if (a>b) {
		System.out.println("a is larger than b");
	}else {
		System.out.println("a is smaller than b");
	}
		
	int expectedHours=15;
	int actualHours=20;
	
	if(actualHours>expectedHours) {
		System.out.println("you will succeed");
	}else {
		System.out.println("please study more");
	}	
	
	double teaPrice= 4.99;
	double allowedPrice=3.99;
	teaPrice=2;
	//If price is more than i can afford, then i will not buy
	//if price is less or mathces what i can afford then i will buy tea
	
	if(allowedPrice>=teaPrice) {
		System.out.println("I will buy tea");
	}else {
		System.out.println("I cannot afford, I need to study more");
		System.out.println("I will go back and study more");
	
}


}
}                                     

