package com.class30;

interface Person {
	void speak();


	void walk();
}


class Teacher implements Person {

	@Override
	public void speak() {
		System.out.println("I want to speak now ");

	}

	@Override
	public void walk() {
		System.out.println("I like to go on walks");

	}

}

public class Interface1 {
public static void main(String[] args) {
	
	Teacher obj=new Teacher();
	obj.speak();
	obj.walk();
	
	
}
}
