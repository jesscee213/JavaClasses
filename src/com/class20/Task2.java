package com.class20;

import com.class18.Task3;

public class Task2 {
//Create a method that will take a String and return whether String is palindrome or not. 
			//Method should be available to all classes within your projects.
	
	public void isPalindrome(String str) {
        String str2="";
for(int i=str.length()-1; i>=0; i--) {
            
            str2=str2+str.charAt(i);
            
;            
        }
        
        if(str.equals(str2)) {
            
            System.out.println("it is palindrome");
        }
        else {
            
            System.out.println("it is not palindrome");
        }
    }
        
    
    public static void main(String[] args) {
       
Task2 word=new Task2();
word.isPalindrome("kayak");
word.isPalindrome("flower");
    }
}




