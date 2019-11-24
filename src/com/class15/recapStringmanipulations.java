package com.class15;

public class recapStringmanipulations {
public static void main(String[] args) {
	//1 way
	String str="hello";
	//2nd way
	String str2=new String("hello");
	
	System.out.println(str);
	System.out.println(str2);
	
	int length=str.length();
	System.out.println(length);
	
	System.out.println(str.toLowerCase()); 
	
	//verify if the String is empty
	String myString="";//empty value
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty);
	
	//String myString1=null;//no value at all
	//System.out.println(myString1.isEmpty());
	
	// how to verify existence of characters in the String
	String a="Good evening students";
	boolean exist=a.contains("Students");
	System.out.println(exist);
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("student"));
	
	
	
	
	
	
	
	
	
	
	
	
}
}
