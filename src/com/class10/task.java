package com.class10;

public class task {
public static void main(String args[]) {
	char []grade= {'A','B','C','D','E','F'};
	System.out.print(grade[1]);
	
	System.out.println();
	char []score=new char[6];
	score[0]='A';
	score[1]='B';
	score[2]='C';
	score[3]='D';
	score[4]='E';
	score[5]='F';
	
	System.out.println("My grade is an "+score[0]);
	
	for(int a=0;a<score.length;a++) {
		System.out.println(score[a]);

	}
	
	double[] num= {1.4,2.2,3.4,4.5,5.5};
	double size=num.length;
	
	for(int b=0;b<size;b+=2) {
	System.out.print(num[b]+" ");
	
	}
	
	
	
	
	
	
}
}
