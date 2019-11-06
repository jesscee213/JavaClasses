package com.class13;

public class RegularExpressions2 {
public static void main(String[] args) {
	//HOW DO YOU REMOVE ONLY SPACES. USE SPACE WITH NOTHING
	
	String str="Today is our Java Class";
	System.out.println(str.replace(" ", ""));
	System.out.println(str.replaceAll("\\s", ""));
	
	String doc="Video provides a powerful way to help you"
			+ "Prove your point. When you click online Video"
			+" You can paste and embed code for the video"
			+ " want to add. YOu can also type a keywod to search"
			+ " online for the video that best fits your document";
	
	System.out.println(doc.toLowerCase().replace("video", "Audio"));
	System.out.println(doc.replaceAll("powerful(.*)", ""));
}
}
