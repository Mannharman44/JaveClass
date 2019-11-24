package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor() {
		System.out.println("I am non argument Constructor");
	}

	ThisWithConstructor(String str) {
		this();
		System.out.println("I am Constructor with 1 String parameter");
	}
	ThisWithConstructor(String str,String str1){
		this(str);
		System.out.println("I am Constructor with 2 String parameter");
	}
	

	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor("hello");
		ThisWithConstructor obj1 = new ThisWithConstructor("hello","Bye");
		

	}

}