package ctor;
public class Car{
	String brand;
	String model;
	int year;
	
	public Car(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void display(){
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
	}
}