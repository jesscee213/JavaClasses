package com.class29;

public class PhoneTest {
public static void main(String[] args) {
	//YOu cannot create an object of an ABSTRACT CLASS
	//--------> Phone phone=new Phone();- cannot instantiated
	//We can create it inidrectly
	
	Phone phone=new iPhone();
	phone.makecall();
	phone.sendText();
	phone.takePicture();
	phone.playGames();

	
	}
}
