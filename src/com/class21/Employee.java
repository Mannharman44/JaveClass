package com.class21;

public class Employee {

	int eId;
	int salary;
	static String CEO;

	void diplay() {
		System.out.println("Employee id is: "+eId+" and the salary is: "+salary+" and the CEO is: "+CEO);
	}
	
	public static void main(String args[]) {
		
		Employee obj1=new Employee();
		obj1.eId=123;
		obj1.salary=90000;
		Employee.CEO="Harman";
		obj1.diplay();
		
		Employee obj2=new Employee();
		obj2.eId=234;
		obj2.salary=80000;
		Employee.CEO="Harman";
		obj2.diplay();
		
	}
}
