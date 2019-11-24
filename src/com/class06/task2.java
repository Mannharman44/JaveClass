package com.class06;

import java.util.Scanner;

public class task2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you need a loan? true of false");
		boolean loan = input.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			int score = input.nextInt();
			if (score < 600) {
				System.out.println("Not eligible");
				if (score > 600 && score <= 700) {
					System.out.println("Maybe eligible");
				}
			}
		}
	}
}
