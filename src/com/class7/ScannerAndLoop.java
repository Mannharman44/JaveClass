package com.class7;
import java.util.Scanner;
public class ScannerAndLoop {
public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	int a=5;
	while(a<10) {
	
	
	System.out.println("Please enter your name");
	String name=input.nextLine();
	
	
	
	System.out.println("Good afternoon "+name);
	a++;
	
	}	
}
}
