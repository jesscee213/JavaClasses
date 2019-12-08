package com.class27;

public class Student {
//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism
//
//}

	public void study() {
		System.out.println("Student needs  to study");
	}

	private void doHomework() {
		System.out.println("Student needs  to do homework");
	}

	protected void research() {
		System.out.println("Student needs  to do research");
	}

	void attendClasses() {
		System.out.println("Student needs  to do attend classes");
	}
}

class SyntaxStudent extends Student {
	//@Override -- we are not overriding, 
	//child class having it is own method doHomework();
	private void doHomework() {
		System.out.println("Student needs  to do homework");
	}
	
	@Override
	public void study() {
		System.out.println("Syntax Student need to study a lot");
	}
	@Override
	public void research() {
		System.out.println("Syntax Student needs  to do a lot of research");
	}
	@Override
	protected void attendClasses() {
		System.out.println("Syntax Student needs  to do ALL attend classes");
	}	
}