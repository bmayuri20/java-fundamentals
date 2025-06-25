package com;
public class Fibonacci{
	
	
	public static void main(String[] args){
		int firstTerm = 0;
		int secondTerm = 1;
		int limit =10;
		int i=1;
		while(i<=limit){
			System.out.print(firstTerm + " ");
			int nextterm = firstTerm + secondTerm;
			
			
			firstTerm = secondTerm;
			secondTerm = nextterm;
			
			i++;
			
		}
		
	}
}