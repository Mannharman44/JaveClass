package com.class24_1;

public class CheckingAccount extends BankAccount {

	private int remainingChecks;
	
	
	public CheckingAccount() {
		
		super();
		remainingChecks=100;
	}
	public CheckingAccount(String owner, double intBalance,int remainingChecks) {
		super(owner, intBalance);
		this.remainingChecks=remainingChecks;
		
	}
	public void UseCheck() {
		
		remainingChecks--;
	}
	public void GetCheck() {
		
		remainingChecks++;
		
		
	}
	
	
	
}
