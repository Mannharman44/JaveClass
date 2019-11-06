package com.class12;

public class task1 {
	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8, 4,2 };
		for (int b = 0; b < a.length; b++) {
			for (int j = b + 1; j < a.length; j++) {
			if(a[b]==a[j]) {
				System.out.println(a[j]);
			}
				
				
			}

		}

	}
}
