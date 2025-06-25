package com;
public class Calculator1{


	public static void main(String[] args){
		
		Addition a = new Addition(7,8);
		System.out.println("Addition = "+ a.add());
		
		Subtraction s = new Subtraction(99, 66);
		System.out.println("Subtraction = "+ s.sub());
		
		Multiply m = new Multiply(78,2);
		System.out.println("Multiplication = "+ m.mul());
		
		Division d = new Division(88,24);
		System.out.println("Division = "+ d.div());
		
		}
		
		}