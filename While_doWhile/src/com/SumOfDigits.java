package com;
public class SumOfDigits{
	public static void main(String[] args){
		SumOfDigits sum = new SumOfDigits();
		System.out.println(sum.digitsum());
	}
	
	public int digitsum(){
		int num = 1034;
		int sum = 0;
		
		while(num != 0){
		int rem = num % 10;
		sum +=rem;
		num = num/10;
		}
		return sum;
	}


}