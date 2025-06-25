package com;
public class Factorial{
	public static void main(String[] args){
		int n = 5;
		int fact = 1;
		
		while(n >= 2){
			fact = fact*n;
			n--;
		}
		System.out.print("FActorial:"+ fact);
	}

}