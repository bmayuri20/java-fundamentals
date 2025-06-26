package com;
import java.util.Scanner;

public class Q3{
	public void area(float r){
		//float r;
		float area = (float)(3.14*r*r);
		System.out.println("Area = " + area);
	}
	
	public static void main(String[] args){
		Q3 z = new Q3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		z.area(sc.nextFloat());
		sc.close();
	}
	
	}