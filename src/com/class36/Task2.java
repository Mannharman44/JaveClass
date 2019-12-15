package com.class36;
import java.util.*;
import java.util.Map.Entry;
class Person{
	 String name,lastName;
	 int age,salary;
	
	
	public Person(String name,String lastName,int age,int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	public void display() {
		System.out.println("My name is: "+name+" "+lastName+" i am "+age+" years old"+" and my salary is "+salary);
		
	}
}
public class Task2 {
public static void main(String[] args) {
	
	Map<Integer,Person>personMap=new TreeMap<>();
	personMap.put(1, new Person("Harman","Mann",99,90000));
	personMap.put(2, new Person("Joe","Smith",75,80000));
	personMap.put(3, new Person("Dennis","Pham",60,70000));
	personMap.put(4, new Person("Raj","Singh",55,85000));
		
	
	Set<Integer>set=personMap.keySet();
	for(int a:set) {
		
		System.out.println(a+" ");
		personMap.get(a).display();
	}
	
	
	
	
}
	
	
	
}
