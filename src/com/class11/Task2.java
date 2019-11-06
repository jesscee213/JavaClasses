package com.class11;

public class Task2 {
//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
public static void main(String[] args) {
	

int[][]arr= {

		{2,7,5,8,4},
		{56,6,87,5},
		{54,0,13,2},
		
};
for (int []i:arr) {
    for( int j: i) {
        System.out.print(j+" ");

}
System.out.println();
}
System.out.println("***********************");

int[][] values= {
        {4,5,6,7},
        {1,2,3,4},
        {0,9,8,7}
};
for (int i = 0; i < values.length; i++) {
    for (int j = 0; j < values[i].length; j++) {
        System.out.print(values[i][j]+" ");
    }
    System.out.println();
}
}}