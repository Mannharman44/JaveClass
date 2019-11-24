package com.class21;

public class Task3 {

	public static void main(String[] args) {
		Person obj=new Person(5,"Joe","Black");
		
		System.out.println(obj.age);
	}
	
	
}
class Person {
	int age;
	String name,color;
	
	Person(int a,String n,String c){
		age=a;
		name=n;
		color=c;
		
	}
}