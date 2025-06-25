package com;
//Parameterized ctor practice
public class Calculator{
	int x;
	int y;
	
	public Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int add() {return x+y;}
	public int sub() {return x-y;}
	public int mul() {return x*y;}
	public int div() {return x/y;}
	
	public static void main(String[] args){
		Calculator e = new Calculator(200,100);
		
		System.out.println("Addition = "+ e.add());
		System.out.println("Subtraction = "+ e.sub());
		System.out.println("Multiplication = "+ e.mul());
		System.out.println("Division = "+ e.div());
		
	}
	
	}