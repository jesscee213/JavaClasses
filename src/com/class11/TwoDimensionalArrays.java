package com.class11;

public class TwoDimensionalArrays {
public static void main(String[] args) {
	String[] [] array=new String [2][3];
	array[0][0]="Jessica";
    array[0][1]="Mateo";
	array[0][2]="Lucky";
	
	array[1][0]="John";
    array[1][1]="Maria";
	array[1][2]="Jose";
	
			System.out.println(array[1][2]);			



int  [] [] numbers= {
		{8,7,5,3,8},
		{1,5,6,4,9},
		{3,6,8,0,7},
};
//to identify number of rows
System.out.println("The numbers of the Arrays are:="+numbers.length);
//to i dentify the numbers of columns/elements in row
System.out.println("The numbers of columns are:=" +numbers[1].length);

for (int i=0; i<numbers.length; i++) {
	for(int j=0; j<numbers[i].length; j++) {
		System.out.println(numbers[i][j]+" ");
	}
	System.out.println();
		
	}
	
}
		
}
