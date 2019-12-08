package com.class17;

public class ObjectOfDogClass {
public static void main(String[] args) {
	Dog dog1=new Dog();
	dog1.Breed="huskey";
	dog1.Size="Large";
	dog1.Color="White";
	dog1.play();
	dog1.Eat();
	dog1.run();
 
	System.out.println(" I have a "+dog1.Color+ " "+dog1.Breed+" and he is "+ dog1.Size);

Dog dog2=new Dog();
	dog2.Breed="Bulldog";
	dog2.Size="medium";
	dog2.Color="tan";
	dog2.play();
	dog2.Eat();
	dog2.run();

	System.out.println(" I have a "+dog2.Color+ " "+dog2.Breed+" and he is "+ dog2.Size);
	
	Dog dog3=new Dog();
	dog3.Breed="Labrador";
	dog3.Size="Large";
	dog3.Color="Golden";
	dog3.play();
	dog3.Eat();
	dog3.run();
	System.out.println(" I have a "+dog3.Color+ " "+dog3.Breed+" and he is "+ dog3.Size);
}
}