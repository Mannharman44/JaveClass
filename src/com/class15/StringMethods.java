package com.class15;

public class StringMethods {
public static void main(String[] args) {
	String str="java classes at syntax are awesome";
	str=str.replace("awesome", "great");
	System.out.println(str);
	str=str.replace("a", "1234 68%$# &%%$");
	System.out.println(str);
	
	str=str.replaceAll("[^A-Za-z0-9]", "" );
	System.out.println(str);
	
	//split
	
	String myString="Java classes at syntax are awesome";
	String [] array=myString.split("a");
	System.out.println(array.length);	
	
}
}
