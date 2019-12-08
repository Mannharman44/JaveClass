package com.class24_1;

public class Addition {

	
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	
	
	
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public void add(double num1,double num2) {
		System.out.println(num1+num2);
		
	}
	public double add(int num1,double num2) {
		
		double sum= num1+num2;
		return sum;
		
	}	public void add(double num1,int num2) {
		
		System.out.println(num1+num2);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Addition obj=new Addition();
		obj.add(5, 5);
		obj.add(5, 5, 5);
		obj.add(5.5, 5.5);
		obj.add(5, 5.5);
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(0, 4));
		
	}
	
	
	
}
