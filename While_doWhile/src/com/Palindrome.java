package com;
public class Palindrome{
	public static void main(String[] args){
		Palindrome num = new Palindrome();
		num.isPalindrome(12321);
	}
	
	public void isPalindrome(int originalNum) {
		
		int revNum = reverse(originalNum);
		if(originalNum == revNum)
			System.out.println("Num is a Palindrome");
		else
			System.out.println("Num is not a Palindrome");
	}
	
	public int reverse(int num){
		
		int rev = 0;
		
		while(num != 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}
	
	


}