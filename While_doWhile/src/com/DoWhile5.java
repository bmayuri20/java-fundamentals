package com;
public class DoWhile5{
	public static void main(String[] args)
	{	
		DoWhile5 dw = new DoWhile5();
		System.out.println("FActorial: "+ dw.print(6));
	}
	
	public int print(int num)
	{	
		int fact = 1;
		do{
			fact *= num;
			num--;
		}while(num >=1);
		
		return fact;
	}
}