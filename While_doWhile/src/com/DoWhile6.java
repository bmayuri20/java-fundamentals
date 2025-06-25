package com;
public class DoWhile6{
	public static void main(String[] args)
	{	
		DoWhile6 dw = new DoWhile6();
		dw.print(1, 50);
	}
	
	public void print(int start, int end)
	{	
		do{
			if( start % 2 != 0 )
				System.out.print(start + " ");
			start++;
		}while(start <= end);
	}
}