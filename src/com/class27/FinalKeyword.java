package com.class27;

public class FinalKeyword {

	public final String str = "Hello";

	public static void main(String[] args) {
	}

	public final void hello() {
		System.out.println(" i am parent class");
	}

}
class FinalKeyWordChild extends FinalKeyword{
	
	//public final void hello() {
		//System.out.println(" i am parent class");
	//}
	
}