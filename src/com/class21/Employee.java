package com.class21;

public class Employee {
int eID;
int salary;
public static String CEO="Sumair";
void printInfo() {
System.out.println("Employee ID: "+eID+" Employee Salary: "+salary+" CEO is "+CEO);
}
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.eID=12345;
	employee.salary=120000;
	Employee.CEO="Sumair";  //change to static cause every class created will have the same CEP
	employee.printInfo();
	
	Employee emp2=new Employee();
	emp2.eID=69694;
	emp2.salary=45000;
	emp2.printInfo();
	
	
	
}
}

