package com.class19;

public class Task {
	
	String createEmail(String name,String lastName,String email) {
	String str=name+lastName+email;
	
	return str;
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		Task obj=new Task();
		String obj1=obj.createEmail("Harman","Mann","dhdhdhdh@yahoo.com");
		System.out.println(obj1);
		
		
	}
	

}

