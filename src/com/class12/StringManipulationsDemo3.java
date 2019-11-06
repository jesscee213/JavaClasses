package com.class12;

public class StringManipulationsDemo3 {

//	This method checks whether a string is empty or not.
//	This method returns rtue if the given strin
//	is empty, else it returns to false.

	public static void main(String[] args) {
	String str="";
	System.out.println("Is this string empty="+str.isEmpty());
	String str2="hello";
	System.out.println("is this string empty="+str2.isEmpty());
	
if (!str.isEmpty()){
	System.out.println("This is not empty");
}else {
	System.err.println("This is an empty String");
	
	///// How to print out one sentence in two line in the output
	String sentence="Someday over the rainbow skies are blue and the \n dreams that you dare to dream really do come true";
System.out.println(sentence);


String str3="Hello ";
String str4="World ";
String str5="People";
System.out.println(str3+str4+str5);
System.out.println(str3.concat(str4).concat(str5));

}
}
	
	
}
