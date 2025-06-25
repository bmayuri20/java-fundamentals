package com;
public class Ctor2
{
	int a=10;
	public Ctor2() {
		System.out.println("Non-Parameterized Ctor Called");
	}
	
	public static void main(String[] args){
		System.out.println("MAIN");
		Ctor2 c1 = new Ctor2();
		Ctor2 c2 = new Ctor2();
 }

}