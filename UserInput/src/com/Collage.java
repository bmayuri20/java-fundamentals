package com;
import java.util.Scanner;

public class Collage
{
	public static void main(String args[ ])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Clgname");
	String clgname = sc.nextLine();
	String cityname =sc.nextLine();
	int pincode = sc.nextInt();
	sc.nextLine();
	String type = sc.nextLine();
	
	System.out.println("Collage Name = "+clgname);
	System.out.println("City Name = "+cityname);
	System.out.println("Pin Code = "+pincode);
	System.out.println("Institute Type = "+type);
	
	sc.close();
 }
 }
