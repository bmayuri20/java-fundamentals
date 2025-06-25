package com;
import java.util.*;
public class DoWhile2{
	public static void main(String[] args)
	{	
		
		DoWhile2 dw2 = new DoWhile2();
		dw2.print();
	}
	
	public void print()
	{	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		System.out.println("Enter number:");
		do{
			num = sc.nextInt();
			sum += num; 
			System.out.println("Sum = " +sum);
		
		}while( num != 0);
	
	}


}