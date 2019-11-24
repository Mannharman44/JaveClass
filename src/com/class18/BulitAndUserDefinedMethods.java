package com.class18;
import java.util.Scanner;
public class BulitAndUserDefinedMethods {
public static void main(String[] args) {
	
	String str="Hello";
	str=str.replace("Hello", "Hi");
	System.out.println(str);
	
	
	Scanner scan=new Scanner(System.in);
	scan.nextLine();
	
	
	BulitAndUserDefinedMethods obj=new BulitAndUserDefinedMethods();
	
	obj.myMethod();
	
	
	
	
	
}
void myMethod() {
	System.out.println(" this is user defined method ");
}
	
	
}
