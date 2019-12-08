package com.class25;

public class PrivateMethod {

	private void display(int num1) {
		
		System.out.println("i am method with 1 int "+num1);
		
	}
	private void display(String str) {
		
		System.out.println("i am method with 1 String "+str);
		
	}
	private void display(char a) {
		
		System.out.println("i am method with 1 Char "+a);
		
	}
	
	public static void main(String[] args) {
		PrivateMethod obj=new PrivateMethod();
		obj.display('A');
		obj.display(4);
		obj.display("Hello");
		
		
	}
	
}
