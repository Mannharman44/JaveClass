package com.class03;

public class RealationalOperators {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 19;

		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println("************");

		double d = 1.99;
		double d1 = 2.99;

		boolean b = d > d1;
		System.out.println(b);

		boolean b1 = d < d1;

		boolean b2 = d == d1;

		boolean b3 = d != d1;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		int a = 90;
		int a1 = 300;
		// if number is bigger than number a1
		// I want to print a is larger than a1

		if (a > a1) {
			System.out.println("a is larger than a1");

		} else {
			System.out.println("a is smaller than a1");

			int expectedHours = 15;
			int actualHours = 20;

			if (actualHours > expectedHours) {
				System.out.println("you will succeed");
			} else {
				System.out.println("please study more");
			}

			double teaPrice = 4.99;
			double allowedPrice = 3.99;
			// teaPrice-=2;
			if (allowedPrice <= teaPrice) {
				System.out.println("I will buy tea");
				System.out.println("And I will enjoy my tea");
			} else {
				System.out.println("I cannot afford, I need to study more");
				System.out.println("i will go back to study more");
			}

			System.out.println("I keep writing more code");

		}

		boolean val = true;

		if (val) {
			System.out.println("Hello");

		} else {

			System.out.println("Bye");

		}

	}
}
