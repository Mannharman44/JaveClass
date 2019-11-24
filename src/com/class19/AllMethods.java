package com.class19;

public class AllMethods {

	int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}

	int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;

	}

	int div(int num1, int num2) {
		int div = num1 / num2;
		return div;

	}

	int mult(int num1, int num2) {
		int mult = num1 * num2;
		return mult;

	}

	int findLargest(int num1, int num2) {
		int largest;
		if (num1 > num2) {
			largest = num1;

		} else {
			largest = num2;

		}

		return largest;

	}
	
	boolean idOdd(int num) {
		boolean isOdd;
		if(num%2!=0) {
			isOdd=false;
			
		}else {
			isOdd=true;
		}
		return isOdd;
	}
	/** methos will take a week day number and return 
	 * a week day name 
	 */
	
	String weekDayName(int weekday) {
		String weekDayName;
		switch(weekday) {
	
		case 1:
			weekDayName="Monday";
			break;
		case 2:
			weekDayName="Tuesday";
			break;	
		case 3:
			weekDayName="Wendnesday";
			break;
		case 4:
			weekDayName="Thursday";
			break;
		case 5:
			weekDayName="Friday";
			
			break;	
		case 6:
			weekDayName="Saturday";
			break;	
		case 7:
			weekDayName="Sunday";
			break;	
		default:
			weekDayName="Unknown";
			
		}
		
		return weekDayName;
		
	}
	
	
	
	
	
}
