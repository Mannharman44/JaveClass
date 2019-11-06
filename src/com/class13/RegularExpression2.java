package com.class13;

public class RegularExpression2 {
public static void main(String[] args) {
	String a="today is ur java class";
	
	
	System.out.println(a.replace(" ", ""));
	System.out.println("*********");
	System.out.println(a.replaceAll("\\s",""));
}
}
