package com.class06;

import java.util.Scanner;

public class task1 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("is there a sale");
		boolean sale = input.nextBoolean();

		double price = 0.0d;
		double dis = 0.0d;
		double finalPrice;

		if (sale) {
			System.out.println("enter the price");
			price=input.nextDouble();
			if (price < 20) {
				dis = price * 0.1;
				finalPrice = price - dis;
			}
			else if (price >= 20 && price < 100) {
				dis = price * 0.2;
				finalPrice = price - dis;
			}
			else if (price>=100 && price<500) {
				dis= price*0.3;
				finalPrice=price-dis;
				
			}
			else {
				dis=price*0.5;
				finalPrice=price-dis;
				
			}
			System.out.println("After discount " +dis+" the price of the item reduce from "+price+" to "+finalPrice);
			
			
			

	}
		else {
			System.out.println("I am not shopping");
			
		}
	}

}
