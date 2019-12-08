package com.class17;

public class ObjectOfCarClass {
	 public static void main(String[] args) {
		

		Car car1=new Car();
	 car1.make="Mazda";
	 car1.model="CX3";
	 car1.color="white";
	 car1.year=2016;
	 car1.wheels=4;
	 car1.windows=5;
	 car1.speed=200;
	 car1.drive(); //calling method 
	 car1.start();
	 car1.accelerate();
	 
	 
	 
	 Car car2=new Car();
	 car2.make="BMW";
	 car2.model="i8";
	 car2.color="purple";
	 car2.year=2019;
	 car2.wheels=4;
	 car2.windows=6;
	 car2.speed=300;
	 
			// I have a white CX3 that goes as fast as 200 mph
	 System.out.println("I have a "+car1.color+ " " +car1.model+ " "+"that goes as fast as "+car1.speed+ " mph");
	// I have a purple BMW with 6 windows
	 System.out.println("I have a "+car2.color + " " +car2.make+ " with " + car2.windows+ " windows");
	 }
	}