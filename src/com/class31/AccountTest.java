package com.class31;

public class AccountTest {
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setBalance(5000);
		double mybalance=acc.getBalance();
		System.out.println(mybalance);
		
		
		acc.setAccountNumber(23455676);
		long accNumber=acc.getAccountNumber();
		System.out.println(accNumber);
		
		int num=123;
		String.valueOf(num);
		
	}


	
	
	
	
	
	
	
}
