package com.class06;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		String country, foodName;
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = input.nextLine();

		switch (country) {

		case "Turkey":
			foodName = "kebab";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		case "Morocca":
			foodName = "Tajin";
			break;
		case "Kazakhstan":
			foodName = "Kumis";
			break;
		case "Pakistan":
			foodName = "Beryani";
			break;
		case "Russia":
			foodName = "Caviar";
			break;
		case "Cuba":
			foodName = "Sofrito";
			break;
		default:
			foodName = "Unknown";
			break;

		}
		System.out.println("you are from "+country+" and your fav food is "+foodName);
		

	}

}
