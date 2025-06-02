package com;
public class HDFCBank{
	
	String name = "Mayuri Borkar";
	int age = 25;
	long accno = 999999999l;
	String cityname = "Pune";
	double balance = 989898.98;
	
	public void viewDetails(){
		System.out.println("Account Number is- "+ accno +
						"\nName- "+ name +
						"\nAge- "+ age +
						"\nCity Name-" +cityname +
						"\nBalance- "+ balance);
	}
	
	public void deposit(){
		double depositAmount = 10000;
		balance = balance + depositAmount;
		System.out.println("\n Current Balance (deposit) = "+ balance);
	}
	
	public void withdraw(){
		double amount = 400;
		balance = balance - amount;
		System.out.println("\n Current Balance (withdraw) = "+ balance);
	}
	
	public void checkFinalBalance(){
		System.out.println("Final Balance - " + balance);
	}
						
	public static void main(String[] args){
		HDFCBank hdfc = new HDFCBank();
		hdfc.viewDetails();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.checkFinalBalance();
	}		
}