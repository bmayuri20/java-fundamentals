package com.basics;

public class Prime{
	public boolean isPrime(int n){
		if (n == 1)
            return false;
		
		for(int i = 2; i <= n/2; i++){
			if(n % i == 0)
				return false;
		}
		return true;
		}
		
		public static void main(String[] args){
			Prime prime = new Prime();
			
			if(prime.isPrime(2))
				System.out.println("Given no is a prime");
			else
				System.out.println("Given no is a composite");
		
	}

}