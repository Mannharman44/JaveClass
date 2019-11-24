package com.class19;

public class ReturnMethods {

	public static void main(String[] args) {

		String str = "Welcome home";
		int numoOfChars = str.length();

		if (numoOfChars >= 10) {
			System.out.println("String is large");
		} else {
			System.out.println("String is small");

		}
		
	char character= str.charAt(4);
	System.out.println(character);
	
	
	Recap obj=new Recap();
	//int num=obj.sum(10, 30);
ReturnMethods obj1=new ReturnMethods();
int sum=obj1.sum(50, 50);
System.out.println(sum);
int large=obj1.findLargest(20, 40);
	System.out.println(large);
	
	
	}
int sum(int num1,int num2) {
	int c=num1+num2;
	return c;
	
}
	
	int findLargest(int num1, int num2) {
		int largest;
		if (num1>num2) {
			largest=num1;
			
		}else {
			largest=num2;
			
		}
		//System.out.println("Largest number is "+largest);
		return largest;
	}

}
