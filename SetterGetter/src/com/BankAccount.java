package com;
public class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getAccountNumber() { 
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public double getBalance(){
		return balance;
	}
}