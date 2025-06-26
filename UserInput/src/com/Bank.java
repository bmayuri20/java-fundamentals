package com;
import java.util.Scanner;

public class Bank
{
	public static void main(String args[ ])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Bank Name");
	String bankname = sc.nextLine();
	String branchName =sc.nextLine();
	int ifscCode = sc.nextInt();
	
	
	System.out.println("Bank Name = "+bankname);
	System.out.println("Branch Name = "+branchName);
	System.out.println("Ifsc Code = "+ifscCode);
	sc.close();
 }
 }
