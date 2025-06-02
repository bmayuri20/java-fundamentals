package com;
class Addition{
	public void add(){
		int a = 20;
		int b = 10;
		System.out.println("Addition=" + (a+b));
		}
}

class Divison{
	public void div(){
		long a = 20l;
		long b = 10l;
		System.out.println("Divison=" + a/b);
		}
}

class Multiplication{
	public void mult(){
		double a = 208;
		double b = 1099;
		System.out.println("Multiplication="+ a*b);
		}
}

class Subtraction{
	public void sub(){
		float a = 20.5f;
		float b = 10.2f;
		System.out.println("Subtraction=" + (a-b));
		}
}

public class CalculatorTest{

	public static void main(String[] args){
	
		Addition addition = new Addition();
		addition.add();
		
		Subtraction subtraction = new Subtraction();
		subtraction.sub();
		
		Multiplication multiplication = new Multiplication();
		multiplication.mult();
		
		Divison division = new Divison();
		division.div();
	}
}