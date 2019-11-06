package com.class11;

public class twodimentionalArrays {
public static void main(String args[]) {
	int [] [] num= {{5,7,8,10},{12,45,33,5},{1,2,4,5,}};
	System.out.println(num.length);
	System.out.println(num[0].length);
	
	for(int a=0; a<num.length;a++) {
		for(int b=0;b<num[a].length;b++) { 
			System.out.print(num[a][b]+ " ");
			
		}System.out.println();
		
	}
		
	for(int[]h:num) {
		for(int m:h) {
			System.out.print(m+ " ");
			
		}System.out.println();
	}
	
		
}
}
