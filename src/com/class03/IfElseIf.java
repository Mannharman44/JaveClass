package com.class03;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {

			System.out.println("Num1 is larger than num2");

		} else if (num1 == num2) {

			System.out.println("Num1 is equal num2");

		} else {

			System.out.println("Num1 is smaller than num2");

		}
	}

	{

		int day = 7;

		if (day == 1) {

			System.out.println("Today is Monday. I have to go to work");

		} else if (day == 2) {

			System.out.println("Today is Tuesday. I have SDLC class");

		} else if (day == 3) {

			System.out.println("Today is wednesday. I have Jave Review class");

		} else if (day == 4) {

			System.out.println("Today is Thursday. I have SDLC review class");

		} else if (day == 5) {

			System.out.println("Today is Friday. Weekend is here");

		}

	}

}
