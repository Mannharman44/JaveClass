package com.class24_1;

public class SavingAccount extends BankAccount{

	private final double  INTRATE=0.05;
	
	public SavingAccount() {
		
		super();
	}
	public SavingAccount(String owner,double balance) {
		super(owner,balance);
		
	}
	public void Addinterest() {
		
		double incBy=(this.getBalance()* INTRATE);
		this.Deposit(incBy);
	}
	
	
	
	
	
	
	
	
}
