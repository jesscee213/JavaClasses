package com.class10;

public class ArrayIntro {
public static void main(String[] args) {
	
	int a;
	a=10;
	
	int a1=10;
	//1way
	int[] b; //declare an array-->preffered way
	int c[];
	b=new int[4];//initialize an array
	int[] array=new int[4]; //2 way---> all in 1 line(deCLAration and initialization
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	//access value from an array
	System.out.println(array[2]);

	//Lets create an array that will store classes that we have
	
	String[] classes= new String[4];// want to store 4 values inside this array
	classes[0]="Java";
	classes[1]="SDLC";
	classes[2]="Manual Testing";
	classes[3]="GIT";
	System.out.println("Today we have "+classes[0]+" class");
	
int[] nums=new int[3];
nums[0]=1;
nums[1]=2;
nums[2]=3;
//how can i change 1 to 100?
nums[0]=100; //changed value to 100
System.out.println(nums[0]);
System.out.println(nums[0]+nums[2]); //100 plus 3=103. num0 was changed to 100
}

}

