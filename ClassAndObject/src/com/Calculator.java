
package com;
public class Calculator{
	public void add()
		{System.out.println(100 + 8); }
	public void sub() 
		{System.out.println(100 - 8); }
	public void div() 
		{System.out.println(100 / 8); }
	public void mult() 
		{System.out.println(100 * 8); }
	
	public static void main(String[] args)
	{
	Calculator calculator = new Calculator();
	calculator.add();
	calculator.sub();
	calculator.div();
	calculator.mult();
	
	
	
	}

}