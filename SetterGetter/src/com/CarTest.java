package com;
public class CarTest{
	
	public static void main(String[] args){
		Car c = new Car();
		
		c.setMake("Kia");
		c.setModel("SUV");
		c.setYear(2025);
		c.setMileage(20);
		
		System.out.println(c.getMake());
		System.out.println(c.getModel());
		System.out.println(c.getYear());
		System.out.println(c.getMileage());
	}

}