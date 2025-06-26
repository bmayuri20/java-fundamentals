package com;
public class BTest{
	public void addValue(B b){
		b.display();
		System.out.println(b.x);
	}
	public static void main(String[] args){
	   //create object of B class
		B b = new B(10);
		
		BTest t = new BTest();
		t.addValue(b);
	}

}