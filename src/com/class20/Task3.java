package com.class20;

public class Task3 {
	//Create a method that will take 1 parameter as a String 
	//and return reversed String. Method should be visibly only within same package.
	 String  a(String word) {
	        String reverse="";
	        for(int i=word.length()-1;i>=0;i--) {
	            reverse=reverse+word.charAt(i);
	        }
	        return reverse;
	    }
	    public static void main(String[] args) {
	        Task3 b=new Task3();
	        String str=b.a("Jessica");
	        System.out.println(str);

	


	    }
		public String reverseString(String str) {
			// TODO Auto-generated method stub
			return null;
		}
		public boolean isPalindrome(String str) {
			// TODO Auto-generated method stub
			return false;
		}
		public String[] arrayOfWords(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}


