package com.class14;

public class Task2 {
public static void main(String[] args) {
	String a="Hello my name is harman";
	
	System.out.println(a.replaceAll(" ", ""));
	
	
	String b="12ab#$34Cd#$";
	
	String c=(b.replaceAll("[^A-z,0-9]",""));
	System.out.println(c.length());
	
	
	String d="Is it Saturday? Is it raining? Do we have Jave class?";
	String [] array=d.split("\\?");
	System.out.println(array.length);
	
	
	
	
	
}
}
