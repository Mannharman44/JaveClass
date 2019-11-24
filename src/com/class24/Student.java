package com.class24;

public class Student {

	public String name,address;
	
	 Student(String name,String address) {
		this.name=name;
		this.address=address;		
	}public void display() {
		System.out.println(this.name+" "+this.address);
		
	}
	public static void main(String[] args) {
		Student obj= new Student("Jon","123 1St");
		obj.display();
		
	}
	
}
