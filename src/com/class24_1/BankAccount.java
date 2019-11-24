package com.class24_1;

public class BankAccount {
private String owner;
private double balance;

public BankAccount() {
	owner ="Bob";
	balance=0.0;	
}
public BankAccount(String owner, double balance) {
	this.owner= owner;
	this.balance=balance;
	
}
public void Deposit(double amount) {
	
	balance += amount;
	//balance =balance + amount;
}
public void Withdraw(double amount) {
	balance -= amount;
	//balance =balance - amount;
}
public String getOwner() {
	return this.owner;
	
}
public double getBalance() {
	return this.balance;
}





}
