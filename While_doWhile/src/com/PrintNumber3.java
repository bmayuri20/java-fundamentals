package com;
public class PrintNumber3{
	public static void main(String[] args){
		int i = 1;
		int ecounter = 0;
		int ocounter = 0;
		while(i<=100){
			if (i%2 == 0)
				ecounter++;
			else
				ocounter++;
				
			
		}
		System.out.println("Even Number:" + ecounter);
		System.out.println("Odd Number:" + ocounter);
	}
}