package com;
public class DoWhile1{
	public static void main(String[] args)
	{
		DoWhile1 dw1 = new DoWhile1();
		dw1.print();
	}
	
	public void print()
	{
		int i=0;
		do{
			System.out.print(++i + " " );
		} while(i < 100);
	}

}