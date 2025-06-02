package com;
class Bank{
	public void createAccount()
		{System.out.println("Your account is created in the bank");}
	
	public void deposit()
		{System.out.println("Money is deposited in your account");}
		
	public void withdraw()
		{System.out.println("Money is withdraw from your account");}
	
	public void checkBalance()
		{System.out.println("Account Balance = XXX");}
}

public class BankTest{
	public static void main(String[] args)
		{
			Bank bank = new Bank();
			bank.createAccount();
			bank.deposit();
			bank.withdraw();
			bank.checkBalance();
		}
}