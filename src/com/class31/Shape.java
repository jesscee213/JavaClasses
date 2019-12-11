package com.class31;

public interface Shape {
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
	//Create 2 child classes: Circle & Square that should have an implementation of area and
	//perimeter calculation. Test your code.
void calculateArea(int a);
void calculatePerimeter(int a);

}
class Circle implements Shape{
	int area;
	int parameter;
	  public void calculateArea(int newCalculateArea){
		area=newCalculateArea;  
	  }
	@Override
	public void calculatePerimeter(int newPerimeter) {
		parameter=parameter+newPerimeter;
		
	}
}

