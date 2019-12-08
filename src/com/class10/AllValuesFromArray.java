package com.class10;

public class AllValuesFromArray {
public static void main(String[] args) {
	
	char[] grades1 = {'A', 'B', 'C', 'D', 'E', 'F'};
     int a=2;
	System.out.println("Grade= "+grades1[1]);
	System.out.println(a);
	
	a+=2; //2+2
	System.out.println(grades1[a]);
	a--; //3
	System.out.println(grades1[a]);
	System.out.println("------------------");
	
//	System.out.println(grades1[0]);
//	System.out.println(grades1[1]);
//	System.out.println(grades1[2]);
//	System.out.println(grades1[3]);
//	
 
	for (int i=0; i<grades1.length; i++) {
		System.out.println(grades1[i]);
	}

	String[] animals= {"Cat", "Dog", "Cow","Snake","Elephant"};
	int size=animals.length;
	
	for (int i=0; i<size; i++) {
		System.out.print(animals[i]+" ");
		
	//Create an array to store 5 double values, print all in 1 line

System.out.println("");
	}
	double[] num= {13, 14, 15, 16, 17};
	int value=num.length;
	
	for (int j=0; j<value; j++) {
		System.out.print(num[j]+ " ");
		
	}
	
	}
}

