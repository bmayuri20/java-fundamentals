package com;
class Animal1{
	public void lion()
		{System.out.println("This is a Lion");}
		
	public void elephant()
		{System.out.println("This is an elephant");}
		
	public void camel()
		{System.out.println("This is a camel");}
		
	public void panther()
		{System.out.println("This is a panther");}
		
	public void leopard()
		{System.out.println("This is a leapard");}
		
	public void puma()
		{System.out.println("This is a puma");}
		
	public void tiger()
		{System.out.println("This is a tiger");}
}

public class AnimalTest{	
	public static void main(String[] args){
	Animal1 animal = new Animal1();
	animal.lion();
	animal.elephant();
	animal.camel();
	animal.panther();
	animal.leopard();
	animal.puma();
	animal.tiger();
	}

}