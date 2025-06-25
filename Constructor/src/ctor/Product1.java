package ctor;
public class Product1{
	String name;
	int price;
	int quantity;
	
	public Product1(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void display(){
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);
	}
}