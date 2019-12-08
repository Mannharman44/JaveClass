package com.class32;

public class Recap {

	public static void main(String[] args) {
		// single value
		int in = 10;

		// multiple values

		int[] nums = { 10, 12, 14 };

		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;

		System.out.println(arr[2]);

		for (int num : nums) {
			System.out.println(num);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		Fruit f=new Apple();
		Fruit f1=new Banana();
		Object f2=new Orange();
		Object monkey=new Monkey();
		
		Object [] mixArray= {f,f1,f2,monkey,"hello"};
		
		for(Object fr:mixArray) {
		
		System.out.println(fr);
		}
		
	}

}
class Monkey extends Object{
	
}

class Fruit extends Object {
	
	
}

class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}