package com.class21;

public class Students {
//	● Create three variables studentName , studentID and numberOfStudents
//	● Create three objects of the Students Class
//	● Set the value for studentName , studentID and increment the numberOfStudents for each object
//	● Print out total number of students
//}

	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	void printInfo() {
		System.out.println(studentName+studentID+numberOfStudents);
	}
	public static void main(String[] args) {
		
	
	Students stu1=new Students();
	Students stu2=new Students();
	Students stu3=new Students();
	
	stu1.studentName="Jessica Cabrera";
	stu1.studentID=13;
	Students.numberOfStudents++; // to make static change to Class name
	
	stu2.studentName="Jose Larios";
	stu2.studentID=11;
	stu2.numberOfStudents++;
	
	stu3.studentName="Enrique Iglesias";
	stu3.studentID=18;
	stu3.numberOfStudents++;
	
	
	System.out.println("The total number of Students: "+stu1.numberOfStudents);
	System.out.println("The total number of Students: "+stu2.numberOfStudents);
	System.out.println("The total number of Students: "+stu3.numberOfStudents);
	
}
}