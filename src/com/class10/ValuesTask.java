package com.class10;

public class ValuesTask {
public static void main(String[] args) {
	//Create an array of countries. While retrieving all values from an array print capital for each country.
String[] country= {"Peru", "France", "Egypt"};
		for(int i=0; i<country.length; i++) {
			if (country[i].equals("Peru")) {
				System.out.println("Lima");
			}else if(country[i].equals("France")) {
				System.out.println("Paris");
			}else if(country[i].contentEquals("Egypt")) {
				System.out.println("Cairo");
			}else {
				System.out.println(country[i]); //not necessary to add this at the end
			}
		}

// SWITCH CAN ALSO BE USED	
		
		String[] countries= {"Peru", "France", "Egypt"};
		for(int i=0; i<countries.length; i++) {
			switch (countries[i]) {
			case "Peru":
			System.out.println("Lima");
			break;
			
			case"France":
			System.out.println("Paris");
			break;
			case "Egypt":
				System.out.println("Cairo");
			break;	
			}
		}

}
}

