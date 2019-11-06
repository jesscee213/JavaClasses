package com.class9;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	

	Scanner scan=new Scanner(System.in);
    int secretNumber=17;
    int num;
    
    
    for(int i=1; i<=20; i++) {
        System.out.println("guess a secret number ranging from 1-20");
        num=scan.nextInt();
        if(num<17) {
            System.out.println("number is to small ");
            
            
        }else if(num>17) {
            System.out.println("number is to large");
        }else if(num==secretNumber) {
            System.out.println("congrats! you found the right number");
            break;
        }
    }
    
    
    
    }

/*
 * write a guessing game where the user has to guess a secret number between 1
 * and 20 after every guess input, the program tells the user whether their
 * number was to large or too small. The program will keep asking the user to
 * enter the number until he finds the correct number. when the correct answer
 * is found the system should display "congratulations!!. You got it!.
 */
{
	//ANOTHER WAY BY ASEL
Scanner scan;
int secretNumber, guessNumber;

scan = new Scanner(System.in);
secretNumber = 12;
// for (int i=0; i<20; i++) -> you are limiting user to 20 inputs
do {
	System.out.println("Please guess my number from 1 to 20");
	guessNumber = scan.nextInt();

	if (guessNumber < secretNumber) {
		System.out.println("Your number is too small");
	} else if (guessNumber > secretNumber) {
		System.out.println("Your number is too large");
	}
} while (guessNumber != secretNumber);

System.out.println("Congratulations you got it");
}
}

 