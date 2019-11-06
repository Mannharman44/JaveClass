package com.class8;
import java.util.Scanner;
public class task2 {
public static void main(String args[]) {
	
	for(int a=1; a<=50;a++) {
		if(a%3==0) {
			continue;
		}System.out.println(a);
		
	}Scanner input=new Scanner(System.in);
	
	for(int d=1; d<=10;d++) {
		System.out.println("apply for credit card");
		String answer=input.nextLine();
		if (answer.equals("yes")) {
			break;
			
		}
	}
	
	
	
}
}
