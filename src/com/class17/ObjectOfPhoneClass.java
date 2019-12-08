package com.class17;

public class ObjectOfPhoneClass {
	public static void main(String[] args) {
		
	
	Phone phone1=new Phone();

	phone1.brand="Iphone";
	phone1.model="XS";
	phone1.color="blue";
	phone1.calling();
	phone1.texting();
	phone1.socialMedia();
 System.out.println("I have a "+phone1.color+" "+phone1.brand);
	
 Phone phone2=new Phone ();
    phone2.brand="Android";
    phone2.model="S9";
    phone2.color="orange";
    phone2.calling ();
    phone2.texting();
    phone2.socialMedia();
   
    System.out.println("I have a "+phone2.color+" "+phone2.brand);
    
    Phone phone3=new Phone();
    phone3.brand="Nokia";
    phone3.model="8110 4G";
    phone3.color="Red";
   phone3.calling();
    phone3.texting();
    phone3.socialMedia();
    System.out.println("I have a "+phone3.color+" "+phone3.brand); 
    
}
}
