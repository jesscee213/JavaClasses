package com.class22;

public class Human {
String name, lastName;
public static void main(String[] args) {
	Human human1=new Human();
	human1.name="John";
	human1.lastName="Smith";
	
	Human human2=new Human();
	human2.name="Jessica";
	human2.lastName="Cabrera";
	
	Human human3=new Human();
	human3.name="Anna";
	human3.lastName="Smith";
	human3.lastName="Roberts";
	
	System.out.println(human1.name+" "+human1.lastName);
	System.out.println(human2.name+" "+human2.lastName);
	System.out.println(human3.name+" "+human3.lastName);
}	
}
