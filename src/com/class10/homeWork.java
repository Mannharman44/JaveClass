package com.class10;
import java.util.Scanner;
public class homeWork {
public static void main(String args[]) {
		Scanner input;
		int snum, gnum;
		
		input=new Scanner(System.in);
		snum=12;
		
       do {
    	   System.out.println("Please guess my number from 1-20");
    	   gnum=input.nextInt();
    	   
    	   if (gnum<snum) {
    		   System.out.println("Your number is too small");
    		   
    	   }else if (gnum>snum) {
    		   System.out.println("Your number is too large");
    		   
    	   }else {
    		   System.out.println("Good job you did it");
    		   
    	   }
       }while (gnum!=snum);
       
		
		
	}
	
	
}
