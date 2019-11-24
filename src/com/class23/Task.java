package com.class23;

public class Task {
	int a,b;
	Task(){
		System.out.println("1st");
	}
	Task(int num1,int num2){
		a=num1;
		b=num2;
		System.out.println("2nd"+(a+b));
	}
public static void main(String[] args) {
	Task obj=new Task();
	Task obj1=new Task(2,5);
	
	
}
}
