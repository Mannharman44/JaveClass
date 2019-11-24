package com.class24;

public class Task {

	public String name;
	public int age;
	
	private Task(String a, int b) {
		name=a;
		age=b;
	}
	public Task(String a) {
		age=30;
		name=a;
		
	}
	protected Task(int a) {
		name="Joe";
		age=a;
	}Task(){
		System.out.println("Default");
		
	}void diplay(){
		System.out.println(name+" "+age);
		
	}
	
	public static void main(String[] args) {
		Task obj=new Task("Bob",25);
		Task obj1=new Task("Steve");
		Task obj2=new Task(25);
		Task obj3=new Task();
		
		obj.diplay();
		obj1.diplay();
		obj2.diplay();
		obj3.diplay();
	}
	
}
