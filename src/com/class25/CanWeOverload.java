package com.class25;

import com.sun.tools.javac.Main;

public class CanWeOverload {

	
	public void methodOne() {
		
		System.out.println("I am method one ");
	}
	
public void methodOne(String str) {
		
		System.out.println("I am method one with "+str);
	}
	// can we overload a main method?

public static void main(String[] args) {
	System.out.println(" I am a main method");
	main("String");
	String [] array= {"A","B"};
	main("Hello",array);
	
	
	
	
	
}
public static void main(String a) {
	System.out.println("i am overloading main method with String");
}	
public static void main(String a, String []args) {
	System.out.println("i am main method with 2 parameters");
}	
}	

