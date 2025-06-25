package com;
public class ReverseNum{
	public static void main(String[] args){
		ReverseNum num = new ReverseNum();
		num.reverse();
	}
	
	public void reverse(){
		int num = 123456;
		int rev = 0;
		
		while(num != 0){
			int rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;
		
		}
		System.out.println(rev);
	}

}