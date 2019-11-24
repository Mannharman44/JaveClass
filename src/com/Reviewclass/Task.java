package com.Reviewclass;

public class Task {

	void num(int n1,int n2) {
		  int max;
	        if (n1>n2) {
	            max=n1;
	        }else {
	            max=n2;
	        }
		
		
		System.out.println("largest number is "+max);
	}
	
	
	
	
	public static void main(String args[]) {
		
		Task nums=new Task();
		nums.num(5,2);
		
		
		
		
		
		
	}
	
	
	
	
}
