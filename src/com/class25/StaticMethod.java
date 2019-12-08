package com.class25;

public class StaticMethod {

	
	  static void display(String name) {
		System.out.println("Hi my name is "+name);
		
	}
	  static void display(String name, int age) {
		System.out.println("Hi my name is "+name+" and i am "+age+" years old");
		
	}
	  static void display(String name, String hobby) {
		System.out.println("Hi my name is "+name+" i love to "+hobby);
		
	}
	public static void main(String[] args) {
		
		StaticMethod obj=new StaticMethod();
		obj.display("Joe");
		obj.display("Joe", 30);
		obj.display("Joe", "Code");
		
		
		
		
		
	}
	
}
