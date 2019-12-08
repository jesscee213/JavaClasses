package com.class28;

public class Child extends Parent {
	String name="James";
	public static void main(String[] args) {
		Child obj=new Child();
		obj.callName();
	}
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.print(lastName);
	}
public void callingMethod() {
	callName(); //calling current class method "callName from Child class
	super.callName(); //using super we are trying to access parents method
}
}
