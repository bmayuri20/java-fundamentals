package com;
import java.util.Scanner;

public class Q4{
	public void area(double l, double w){
		
		double area = l * w;
		System.out.println("Area = " + area);
	}
	
	public static void main(String[] args){
		Q4 z = new Q4();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width");
		z.area(sc.nextDouble(),sc.nextDouble());
		sc.close();
	}
}