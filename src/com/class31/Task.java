package com.class31;

public class Task {
public static void main(String[] args) {
	Person obj=new Person();
	obj.setName("Jon");
	obj.setAge(99);
	
	System.out.println("Hello my name is "+obj.getName()+" and i am "+obj.getAge()+" years old ");
	
	
	
}
}
class Person{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	
	
}