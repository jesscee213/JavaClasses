package com.class14;

public class SplitMethod2 {
public static void main(String[] args) {
	String str="If you come to class early, "
			+ "then you can study more, also you can lear more, "
			+ "and you can leave early";
	String []array=str.split(",");
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
System.out.println("****************************");

//Splitting lines with one sentence
String str1="Welcome to Syntax Technoligies";
String[] array2=str1.split(" ",3);
System.out.println(array2.length);
for (int i=0; i<array2.length; i++) {
	System.out.println(array2[i]);
}
		


}
}
