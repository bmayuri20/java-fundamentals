package com;
public class PrintNumber4{
	public static void main(String[] args){
		int i = 1;
		int evenSum = 0;
		int oddSum = 0;
		while(i<=10){
			if (i%2 == 0)
				evenSum += i;
			else
				oddSum += i;
			
			i++;
				
			
		}
		System.out.println("Even Number:" + evenSum);
		System.out.println("Odd Number:" + oddSum);
	}
}