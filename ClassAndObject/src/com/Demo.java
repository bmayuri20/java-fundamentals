package com;
public class Demo
{
	public void firstName()
	{
		System.out.println("Mayuri");
	}
	public void middleName() 
	{
		System.out.println("Sudhir");
	}
	public void lastName(){
		System.out.println("Borkar");
	}
	public static void main(String [] args)
	{
		Demo d = new Demo();
		d.firstName();
		d.middleName();
		d.lastName();
	}
}