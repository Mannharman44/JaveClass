package com.class8;

public class BreakAndContinue {
	public static void main(String args[]) {

		for (int a = 0; a < 10; a++) {
			if (a == 5) {
				break;

			}
			System.out.println(a);
			
		}
		System.out.println("I am outside of the loop");
	
		
		
		for(int a=1; a<=5; a++) {
			
			if(a==3) {
				continue;
				
			}System.out.println(a);
			
			for(int c=1;c<=20;c++) {
				if(c==5||c==6||c==7) {
					continue;
				}System.out.println(c);
				
				
			}
			
			
			
			
			
			
		}
		
		
	}
}
