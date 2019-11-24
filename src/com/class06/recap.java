package com.class06;

public class recap {

	public static void main(String args[]) {

		int time = 3;
		String timeofDay = null;

		if (time >= 1 && time <= 11) {
			timeofDay = "Morning";

		} else if (time >= 12 && time <= 15) {
			timeofDay = "Noon";

		} else if (time >= 16 && time <= 20) {
			timeofDay = "Evening";
		} else if (time > 20) {
			timeofDay = "Night";

		} else {
			timeofDay = "Invalid";

		}
		System.out.println(timeofDay);
		System.out.println("Time of the day is " + timeofDay);
	}

}
