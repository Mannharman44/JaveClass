package com.class20;

public class Task1 {

	 String str(String a) {
		 String str1="";
		    for(int i=a.length()-1;i>=0; i--) {
		        str1=str1+a.charAt(i);
	}
	return str1 ;
	}
	public  boolean isPalindrome(String str) {
		 boolean result=false;
		 String reverse=str(str);
		 if (str.equalsIgnoreCase(reverse)) {
			result=true;
			
		 }else {
			 result=false;
		 }
		 
		 
		 
		 return result;
	 }
	 
	String [] arrayOfWords(String str) {
		
		String []stringArray;
		
		stringArray=str.split(" ");
		return stringArray;
	}
	
	
	
	 
	 
	public static void main(String args[]) {
		
		Task1 obj=new Task1();
		String obj1=obj.str("Hello");
		System.out.println(obj1);
		
		
		String str="Syntax";
		boolean result2=obj.isPalindrome(str);
		System.out.println("Is \""+str+ "\" Palindrome?"+ result2);
		
		String [] strArray=obj.arrayOfWords("what a beautiful day is today");
		for(String word:strArray) {
			System.out.println(word);
		}
		
		
	}
	
	
}
