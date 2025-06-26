package com;
import java.util.Scanner;

public class Q2{
	int side;
	
	public static void main(String[] args){
		Q2 z = new Q2();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side of a square");
		z.side = sc.nextInt();
		
		System.out.println("Area of a square" + z.side * z.side);
		System.out.println("Perimeter side of a square" + 4 * z.side);
		sc.close();
		
	}

}