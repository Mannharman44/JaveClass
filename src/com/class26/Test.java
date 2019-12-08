package com.class26;

public class Test {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.salary=80000;
		obj.getPaid();
		
		FullTime obj1=new FullTime();
		obj1.salary=80000;
		obj1.bonus=20000;
		obj1.getPaid();
		
		
		Contructor obj2=new Contructor();
		obj2.salary=75000;
		obj2.getPaid();
		obj2.overTime();
		
		
		
	}
	
	
	
	
	
}
