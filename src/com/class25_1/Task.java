package com.class25_1;

public class Task {
//	Create 1 class in which create a methods that will calculate the volume (area) of 
//	Rectangle
//	Square
//	Box
//	Use separate class to test your code
//}


	public void area(int length, int width) {
		System.out.println("the area of rectangle is " +length*width);
	}
	public void area(double side, double side1) {
		System.out.println("the area of square is " +side*side1);
	}
	public void area(int length, int width, int height) {
		System.out.println("the volume of the box is " +length*width*height);
	}
	public static void main(String[] args) {
		Task obj=new Task();
		obj.area(4.5, 5.5);
		obj.area(5, 4);
		obj.area(2,3,4);






}}