package com.class11;

public class Task4 {
	//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
	//Print the sum of all numbers.

	
	public static void main(String[] args) {
		int[][] j= {
				{3,4,5},
				{6,7,8},
				{9,10,11},
		};
		int sum=0;
		for (int[] i:j) {
			for(int c:i) {
				sum=sum+c;
				
			}
		}
	System.out.println("The sum of array " +sum);
	}
//---------------------------------------------------------------
	{
int[][] numbers = {
        { 8, 7, 5, 3 },
        { 1, 5, 6, 7 },
        { 3, 6, 8, 1 }
        };




int sum=0;
for (int i = 0; i < numbers.length; i++) {
    for (int j = 0; j < numbers[i].length; j++) {
        //System.out.print(numbers[i][j] + ” “);
        
        sum=sum+numbers[i][j];
    }
    System.out.println();
}
System.out.println("The sum of all elements in the array is= "+sum);

int sum1=0;
for(int nums[]: numbers) {
    for(int getNum:nums) {
        sum1=sum1+getNum;
    }
}
System.out.println("The sum of all elements in the array is= "+sum1);
}}
