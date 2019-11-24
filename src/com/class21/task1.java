package com.class21;
import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int number1;
	int number2;
	int largest;
	
	System.out.println("Please enter 1st number from 1 to 100");
	number1=input.nextInt();
	
	System.out.println("Please enter 2nd number from 1 to 100");
	number2=input.nextInt();
	
	largest=findLargest(number1,number2);
	System.out.println("you entered the numbers "+number1+" and "+number2);
	System.out.println("\nthe larger number is: "+largest);
	
	
	
	
}
public static int findLargest(int num1,int num2) {
	if(num1>num2)return num1;
	
	else return num2;
	
}
	
	
}
