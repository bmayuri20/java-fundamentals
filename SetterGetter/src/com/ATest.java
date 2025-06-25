package com;
public class ATest{

	public static void main(String[] args){
		A a = new A();
		a.setCount(100);
		
		A a1 = new A();
		a1.setCount(300);
		
		System.out.println(a.getCount());
		System.out.println(a1.getCount());
	
	}


}