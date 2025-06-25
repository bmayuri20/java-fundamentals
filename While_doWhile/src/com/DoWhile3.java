package com;
import java.util.*;
public class DoWhile3{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		DoWhile3 dw = new DoWhile3();
		dw.print(sc.nextInt());
	}
	
	public void print(int num)
	{	
		int i=1;
		do{
			System.out.println(num+" * "+(i)+" = "+(num * i++));
		}while(i <= 10);
	}
	
}
	