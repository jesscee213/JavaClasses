package com.class11;

public class Task3 {
//	Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
//	Develop a program which will identify/print the even numbers only.
//}
public static void main(String[] args) {
	//even numbers 
	int [][] num={ {2,1,3,8},{3,5,9,25},{10,73,14,16}};
    
    for (int i=0; i<num.length; i++)
        for (int j=0; j<num[i].length; j++) {
            if(num[i][j]%2==0) {
            System.out.print(num[i][j]+" ");
        }
    
        }
}}
