package com.class18;

public class Task2 {
	
	//Create a method that will take a number and prints whether the number is even or odd
	void EvenOrOdd(int a) {
         if (a%2==0) {
             System.out.println(a+" is even");
         }else
         {
             System.out.println(a+ " is odd");
         }
         
     }
     public static void main(String[] args) {
         // TODO Auto-generated method stub
Task2 number=new Task2();
 number.EvenOrOdd(16);
     }

}


