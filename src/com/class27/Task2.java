package com.class27;

public class Task2 {
public static void main(String[] args) {
	
	String name="jon";
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
		
		
	}
	
	System.out.println(rev);	
	
}
	
}