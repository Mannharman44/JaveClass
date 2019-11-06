package com.class13;

import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter your class dat::");
	String day=input.nextLine();
	
	if(day.equals("Saturday")) {
		System.out.println("Saturday is your java class");
		
	}else if(day.equals("Sunday")) {
		System.out.println("sunday is yout git class");
		
	}else if (day.equals("Tuesday")) {
		System.out.println("tuesdayis your sdlc class");
		
		
	}else if (day.equals("Thursday")) {
		System.out.println("thursday is your manual testing class");
		
	}else{
		System.err.println("invalid entry!!");
		
		
		
	}
	input.close();
	
}
}
