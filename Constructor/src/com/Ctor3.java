package com;
public class Ctor3
{
	int a;
	public Ctor3(int a) {
		System.out.println("Parameterized Ctor Called");
		this.a =a;
	}
	
	public static void main(String[] args){
		System.out.println("MAIN");
		Ctor3 c1 = new Ctor3(100);
		Ctor3 c2 = new Ctor3(200);
		
		System.out.println(c1.a);
		System.out.println(c2.a);
 }

}