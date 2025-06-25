package com;
public class A
{
	int a=10;
	public void sum(){
		System.out.println(a);
	}
	
	public A() {
		System.out.println("A Constructor");
	}
	
	public static void main(String[] args){
		A a = new A();
		a.sum();
 }

}