package com.class19;


public class TestofMethods {

	public static void main(String[] args) {
		AllMethods obj=new AllMethods();
		int obj1=obj.findLargest(300, 500);
		System.out.println(obj1);
		
		boolean ifOdd=obj.idOdd(500);
		System.out.println(ifOdd);
		
		String obj2=obj.weekDayName(5);
		//System.out.println(obj2);
		
		if (obj2.equals("Tuesday")||obj2.equals("Wednesday")||obj2.equals("Thursday")||obj2.equals("Saturday")||obj2.equals("Sunday")) {
			System.out.println("i am learning java");
			
		}else {
			System.out.println("no java");
		}
		
		
		
		
	}
	
	
}
