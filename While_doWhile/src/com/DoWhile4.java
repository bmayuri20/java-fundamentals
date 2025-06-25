package com;
public class DoWhile4{
	public static void main(String[] args)
	{	
		DoWhile4 dw = new DoWhile4();
		dw.print(6, 80);
	}
	
	public void print(int start, int end)
	{	
		do{
			if( start % 2 == 0 )
				System.out.print(start + " ");
			start++;
		}while(start <= end);
	}
}