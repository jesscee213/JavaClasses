package com.class19;

public class createEmail {

	

	String createEmail(String usersName, String lastName, String emailType) {
		String email=usersName+lastName+"@"+emailType+".com";
	return email;
	}
boolean isPrime(int num) {
	boolean prime=true;
	for (int i=2; i<num ;i++) {
		if(num%i==0);
		prime=false;
		break;
	}


return prime;
}
public static void main(String []args) {
	createEmail obj=new createEmail();
	String email=obj.createEmail("Jessica", "Cabrera", "gmail");
	System.out.println(email);
	System.out.println(obj.isPrime(6));
}
}
		