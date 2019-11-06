package com.class10;

public class twoDarrays {
	public static void main(String[] args) {
		
	
	int cols = 10;
	int rows = 10;
	int[][] myArray = new int[cols][rows];

	// Two nested loops allow us to visit every spot in a 2D array.   
	// For every column I, visit every row J.
	for (int i = 0; i < cols; i++) {
	  for (int j = 0; j < rows; j++) {
	    myArray[i][j] = 0;
	  }
	}
}
}
//For a two-dimensional array, in order to reference every element, 
//we must use two nested loops. This gives us a counter variable for 
//every column and every row in the matrix.