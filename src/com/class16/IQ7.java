package com.class16;

public class IQ7 {
public static void main(String[] args) {
// prime numbers	
	int num=0;
	boolean isPrime=true;
	// if number is equal to 0
	if (num<=1) {
		isPrime=false;
		
	}else {
		
	}
	
	
	for(int i=2;i<num;i++) {
		if (num%i==0) {
			isPrime=false;
			break;
			
		}
		
		
	}
	if (isPrime) {
		System.out.println(num+" is a prime number");
	}else {
		System.out.println(num+"is not a prime number" );
		
	}
	
}
	
	
	
	
}
