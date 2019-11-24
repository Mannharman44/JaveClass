package com.class18;

public class Hello {

	void sayHello(String text) {
		System.out.println(text);
		
	}
	
	
	public static void main(String[] args) {
		
		Hello obj=new Hello();
		obj.sayHello("hello harman");
		obj.sayHelloDifferentLanguage("Russia");
		obj.isSnowing(true);
		
	}
	
	void sayHelloDifferentLanguage(String country) {
		
		
		
		switch(country) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
			
		case "Paraguay":
			System.out.println("Hola");
			break;
			
		case "Albania":
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("i dont know");
			
			
		}
		
		
		
	}
	void isSnowing(boolean isSnowing) {
		
		
		if(isSnowing) {
			System.out.println("stay home");
		}else {
			System.out.println("Go for a walk");
		}
		
		
		
		
	}
	
	
	
}
