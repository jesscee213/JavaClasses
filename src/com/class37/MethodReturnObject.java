package com.class37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodReturnObject {
public static void main(String[] args) {
	 List<String> list=returnStringList("Java", "My favortite subject");
	 System.out.println(list);
	 
}
//create a method that will return an object of scanner class
	public static Scanner returnScanner() {

	Scanner scan=new Scanner(System.in);
return scan;
}
//create method that will return object of List class
public static List<String> returnStringList(String str, String str1) {

	List<String> list=new ArrayList<>();
	list.add(str);
list.add(str1);

return list;

}

}
