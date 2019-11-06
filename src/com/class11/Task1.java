package com.class11;

public class Task1 {
//	Create an array of cars and store 6 elements into it. 
//	Using 2 different loops print all values from the array.
//}

	public static void main(String[] args) {
		String[] cars= { "Mazda", "Jeep","Honda","Tesla","BMW","Audi"};
		for (String i:cars) {
		System.out.println(i);
		}
		
	

//Create an array on integers and calculate the sum of all elements in an array
int[] num= {2,4,6,8};
int sumOfArray=0;
for (int j=0; j<num.length; j++) {
sumOfArray=sumOfArray +num[j];
}
System.out.println(sumOfArray);

	


	//Create an array of countries. While retrieving all values from an array print capital for each country. 
	//(use 2 different loops).

String[] country= {"Peru","China","Thailand"};

for(String cap:country) {
    switch(cap) {
    case "Peru":
    System.out.println("Lima");
    break;
    case "China":
    System.out.println("Beijing");
    break;
    case "Thailand":
    System.out.println("Phuket");
    break;
    }
    System.out.println(cap);
}
}
}
