package com.class28;

public class userInfo extends userClass {
//Write program: userClass  that has a constructor that initializes name and mobile number istance variables.
	//Create a subclass  userInfo that will have user address variable and it also being initialized 
	//through constructor call. Print users name, mobile number and address in userDetails method. 
	//Test your code.
	String name="5601 Magnolia Lane";
	public static void main(String[] args) {
	
	
	userInfo obj=new userInfo();
	obj.callName();
}
	public void callName() {
		System.out.println(name);
	
		System.out.println(mobileNumber);
		System.out.println(super.name);
	}
	public void callingMethod() {
		callName();
		super.callName();
	}}