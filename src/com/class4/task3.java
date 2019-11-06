package com.class4;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
	
		Scanner age=new Scanner(System.in);
	    System.out.println("what is your age");
	int b=age.nextInt();
	if (b>18) {
		System.out.println("will issue a driver licence");
			
	}else {
		System.out.println("will get learners permit");
	}
}
}
