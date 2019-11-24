package com.class07;
import java.util.Scanner;
public class Homework {
/* you need to ask user to pay for coffee
 * you need to keep asking user to pay for it until 
 * entered price is equal =5;
 *after user paid then say "enjoy your coffee!"
 */
 
   
    public static void main(String[] args)
		    {
		        int price;
		        Scanner scan =new Scanner(System.in);
		        do {
		        System.out.println("Pay for coffee please");
		          price=scan.nextInt();
		         price++;
		        } while(price!=5);
		        System.out.println("Enjoy your coffee");
	}
	
	
	
	

	
	
}
