package com.class18;

public class Task1 {
	//create a method that will take 2 parameters as numbers and prints which number is larger
	
	void isLarger(int a, int b) {
        if (a>b) {
            System.out.println(a + " is greater than " + b);
        }else if(a<b) {
            System.out.println(b + " is greater than " + a);
        }else {
            System.out.println(a + " is equal to " + b);
        }
    }
    public static void main(String[] args) {
        Task1 mm=new Task1();
        mm.isLarger(5, 8);
    }

}

