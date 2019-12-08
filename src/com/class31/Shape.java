package com.class31;

public interface Shape {

	void  calculateArea();
	 void calculatePerimiter();

	
}
class Circle implements Shape{
	int r;
	public void calculateArea() {
		double areaCircle=3.14*r*r;
		System.out.println(areaCircle);
		
		
	}
	public void calculatePerimiter() {
		double perCircle=2*3.14*r;
		System.out.println(perCircle);
		
		
	}
	
	
}
class Square implements Shape{
	int length;
public void   calculateArea() {
		double areaSquare=length*length;
		System.out.println(areaSquare);
	}
	public void calculatePerimiter() {
		double periSquare=4*length;
		System.out.println(periSquare);
	}
	

}