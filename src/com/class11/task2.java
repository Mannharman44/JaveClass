package com.class11;

import java.util.Arrays;

public class task2 {
public static void main(String args[]) {
	String []a= {"aaa","bbb","ccc"};
	Arrays.sort(a);
	String []b= {"aaab","bbba","cccb"};
	Arrays.sort(b);
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	

	int [] num= {123,34,15,66,99};
	Arrays.sort(num);
	for (int i:num) {
		System.out.println(i);
	}
	
	
	
	
	
}
}
