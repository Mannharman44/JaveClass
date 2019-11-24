package com.class15;

import java.util.Scanner;

public class Scannerstring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter browser name");
		String browser = scan.nextLine();
		switch (browser.toLowerCase()) {

		case "firefox":
			System.out.println("Execution be performed on " + browser);
			break;

		case "chrome":
			System.out.println("Execution be performed on " + browser);
			break;
		case "ie":
			System.out.println("Execution be performed on " + browser);
			break;
		default:
			System.out.println("please enter valid browser");
		}

	}
}
