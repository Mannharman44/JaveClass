package com.class6;

import java.util.Scanner;

public class Classtask {
	public static void main(String args[]) {

		String month;
		Scanner input = new Scanner(System.in);
		System.out.println("What month were you born");
		month = input.nextLine();
		String season = null;

		if (month.equals("Januray") || month.equals("December") || month.equals("Febuary")) {
			season = "winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
           season= "spring";
		}

		else {
			System.out.println("unknown");

		}
		{
			System.out.println("you were born in " + season);
		}

	}

}
