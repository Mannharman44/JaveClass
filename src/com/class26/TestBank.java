package com.class26;

public class TestBank {
public static void main(String[] args) {
	
	Bank bank=new Bank();
	bank.money=900;
	double fee=bank.chargeFee();
	System.out.println("Bank fee= "+ fee);
	PNC pnc=new PNC();
	pnc.money=900;
	double pncfee=pnc.chargeFee();
	System.out.println("PNC fee= "+pncfee);
	
	
}
}
