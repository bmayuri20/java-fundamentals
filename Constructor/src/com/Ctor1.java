package com;
public class Ctor1
{
	int a;
	
	public static void main(String[] args){
		Ctor1 c = new Ctor1();
		c.a = 12;
		
		Ctor1 c2 = new Ctor1();
		c2.a = 24;
		
		System.out.println(c.a);
		System.out.println(c2.a);
		
 }

}