package com.class10;

public class ArrayTask {
	//Create an array of chars and store grades into it: A,B,C,D,E,F. 
	//Then print a grade B (use 2 different ways of creating an array).

	public static void main(String[] args) {
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("Grade= "+grade[1]);
		
		
		char[] grades1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Grade= "+grades1[1]);


//Create an array of names and store all names of your group. 
//Then print your name from that array. (use 2 different ways of creating an array).
 
String[] names=new String [6];
names[0]="Jessica";
names[1]="Genesis";
names[2]="Aileen";
names[3]="Hasan";
names[4]="Suleyman";
names[5]="Cenk";

System.out.println(names[0]);

//Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using element of array: “Saturday is Java coding Day”. 

String[] word= {"Java","Saturday","day","coding","is"};
System.out.println(word[1]+" " +word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	}
}