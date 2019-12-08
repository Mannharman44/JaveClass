package com.class31;

public abstract class Marks {

	abstract void getPercentage();

}

class A extends Marks {

	int n1, n2, n3;

	A(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;

	}

	public void getPercentage() {
		System.out.println((n1 + n2 + n3) / 3);

	}

}
class B extends Marks{
	int n1,n2,n3,n4;
	
	B(int n1,int n2,int n3,int n4){
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
	}
	public void getPercentage() {
		System.out.println((n1 + n2 + n3+n4) / 4);

	}
	
	
	
}