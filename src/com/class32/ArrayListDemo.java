package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
ArrayList<String>arrayList=new ArrayList<>();
//to store values inside collection
arrayList.add("John");
arrayList.add("Jane");
arrayList.add("Jack");
//to retrieve the vallue form arrayList
System.out.println(arrayList.get(1));

//add more values

arrayList.add("James");
arrayList.add("John");
arrayList.add("Jane");

//how many elements inside the array list?

int size=arrayList.size();
System.out.println(size);
ArrayList<Integer>numArrList=new ArrayList<>();
numArrList.add(100);
numArrList.add(200);
numArrList.add(300);

//update value
numArrList.set(0,1000);
System.out.println(numArrList);

System.out.println("***********************"); 
///retieving values
System.out.println(numArrList.get(2));
for(int num=0; num<numArrList.size(); num++) {  //to chnage value one bye one use Loop
	System.out.println(numArrList.get(num));
}
for(Integer number:numArrList) {
	System.out.println(number);
}


}
}
