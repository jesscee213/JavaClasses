package com.class10;

public class ArrayOfStrings {
public static void main(String[] args) {
	
	String[] names=new String[3];   //ONLY WANT TO STORE THREE ELEMENTS
	names[0]="Diana";
	names[1]="Seda";
	names[2]="Jessica";
	//If you try to add a fourth element you will get an error
	//THE SIZE OF AN ARRA\Y IS FIXED
	
	System.out.println(names[2]);


 int[] numbers=new int [4]; //you have 4 elements, if not all are used they are equal to ZERO
 numbers[1]=100;
 numbers[3]=200;
System.out.println(numbers[0]);


double[] num=new double [4]; //USING DOUBLE 
num[3]=200;
System.out.println(num[2]);
}
}
 
