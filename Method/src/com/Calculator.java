package com;
public class Calculator{
	public void add(){
		int a = 20;
		int b = 10;
		System.out.println("Addition="+ (a+b));
		}
	
	public void sub(){
		int a = 20;
		int b = 10;
		System.out.println("Subtraction=" + (a-b));
		}
	
	public void mult(){
		int a = 20;
		int b = 10;
		System.out.println("Multiplication=" + a*b);
		}
		
	public void div(){
		int a = 20;
		int b = 10;
		System.out.println("Divison=" + a/b);
		}
		
	public static void main(String[] args){
		Calculator calci = new Calculator();
		calci.add();
		calci.sub();
		calci.mult();
		calci.div();
	}
}