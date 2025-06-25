package com;
public class BankAccountTest{
	public static void main(String[] args){
		
		BankAccount b1 = new BankAccount();
		
		b1.setAccountNumber("778946123");
		b1.setAccountHolderName("Mayuri");
		b1.setBalance(100.96);
		
		System.out.println(b1.getAccountNumber());
		System.out.println(b1.getAccountHolderName());
		System.out.println(b1.getBalance());
	}

}