package com;
import java.util.Scanner;

public class Q1{
	String name;
	int rollNo;
	String interest;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Q1 z = new Q1();
		System.out.println("Enter name, rollNo and interest");
		z.name = sc.next();
		z.rollNo = sc.nextInt();
		z.interest = sc.next() + sc.nextLine();
		
		System.out.println("Hey, my name is " + z.name + "and my roll number is " + z.rollNo +".And my field of interest are " + z.interest);
		sc.close();

	}
}