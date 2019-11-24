package com.class16;

public class IQ6 {
public static void main(String[] args) {
	
	//Palindrome
	
	String a= "kayak radar kayak";
	
	String reversed="";
	
	
	for(int i=a.length()-1;i>=0;i--) {
		
		reversed=reversed+a.charAt(i);
	}
	System.out.println(reversed);
	
	if(a.equals(reversed)) {
		System.out.println("it is palindrome");
		
		
		
		
	}else {
		System.out.println("it is not palindrome");
	}
	
	
	
	
	
	
}
}
