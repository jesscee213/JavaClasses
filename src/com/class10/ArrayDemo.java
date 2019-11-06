package com.class10;

public class ArrayDemo {
public static void main(String[] args) {
	int [] nums=new int [4];
	
	nums [0]=12;
	nums [1]=13;
	nums [2]=14;
	nums [3]=15;
	System.out.println(nums.length); //property of the array .Length aka how many elements you have

	String[] array= {"Winter","Fall","Summer","Spring"};
	//I was born in the Summer
	
	System.out.println("I was born in the "+array[2]); //always use array for String
System.out.println(array.length); //how many arrays are there?
int arraySize=array.length;
System.out.println(arraySize); //array.length will return an integer
}
}