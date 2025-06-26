package com;
import java.util.Scanner;

public class Marksheet
{
	public static void main(String args[ ])
	{
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks of three subjects");
	int sub1 = sc.nextInt();
	int sub2 = sc.nextInt();
	int sub3 = sc.nextInt();
	
	int total = sub1 + sub2 + sub3;
	float percentage = total / 3;
	
	
	System.out.println("Total = "+ total);
	System.out.println("percentage = "+ percentage);
	
	sc.close();
 }
 }
