package com.class17;

public class ObjectOfComputerClass {
public static void main(String[] args) {
	Computer comp1=new Computer();
	
	comp1.brand="Apple";
	comp1.name="Macbook Pro";
	comp1.keyboard=true;
	comp1.screen=15;
	comp1.memory=250;
	comp1.watchMovie();
	comp1.coding();
	comp1.playGames();
	//comp1.brand="Microsoft"; if you change brand it will execute from top to bottom
	
	System.out.println("I have an "+comp1.brand+" "+comp1.name+ " with a sceen size of "+comp1.screen+ " inches");
	
	Computer comp2=new Computer();
	comp2.brand="Microsoft";
	comp2.name="Windows";
	comp2.keyboard=true;
	comp2.screen=13;
	comp2.memory=300;
	comp2.watchMovie();
	comp2.coding();
	comp2.playGames();
	
	System.out.println("I have a "+comp2.brand+" "+"And is runs at "+comp2.memory+ " ram of memory");
}
}
