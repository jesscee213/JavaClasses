package com.class25_1;

public class ConstructorOverloading {
public ConstructorOverloading() {
	System.out.println("I am a non argument constructor");
	
}
ConstructorOverloading(String str){
	System.out.println("I am a non argument constructor");
}
//having different type
ConstructorOverloading(int num){
	System.out.println(" I am a constructor with 1 int param");
}
}
