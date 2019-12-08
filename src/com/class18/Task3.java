package com.class18;

public class Task3 {

	//create a method that will print whether given String is palindrome or not
	void isPalindrome(String str) {
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
        // TODO Auto-generated method stub
Task3 word=new Task3();
word.isPalindrome("kayak");
word.isPalindrome("flower");
    }
}
