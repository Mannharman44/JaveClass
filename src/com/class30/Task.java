package com.class30;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Task {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());

		Bank c = new PNB();
		System.out.println("ROI: " + c.rateOfInterest());
	}
}
