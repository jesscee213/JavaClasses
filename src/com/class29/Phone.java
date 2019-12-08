package com.class29;

public abstract class Phone {
public void makecall() { //implemented methods with Body
	System.out.println("Make Call");
	
}
public void sendText() {
	System.out.println("Send Text");
}
public abstract void takePicture() ; //no implementation/ NO BODY
public abstract void playGames();	
}

class iPhone extends Phone{

	@Override
	public void takePicture() {
	System.out.println("iPhone takes pictures");
	}	
	

	@Override
	public void playGames() {
	System.out.println("Play Games on iPhone");
		
	}}
	class Samsung extends Phone{

		@Override
		public void takePicture() {
			System.out.println("Samsung takes pictures");
		}
	

		@Override
		public void playGames() {
			System.out.println("Play Games on Samsung");	
			
		}
		
		}
		

