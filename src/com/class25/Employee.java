package com.class25;

public class Employee {
	
	 int salary;
	static String companyName;
	protected int employeeID;
	private String employeeSsn;
	
	
	
	
	void work() {
		System.out.println("I work in "+companyName+" company");
		
	}
	void getPaid() {
		
		System.out.println("I get paid "+salary);
		
		
	}
}
