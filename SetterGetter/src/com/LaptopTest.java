package com;
public class LaptopTest{

	public static void main(String[] args){
		LaptopTest m = new LaptopTest();
		m.showLaptopInfo();
		
	}
	
	public void showLaptopInfo() {
		
		Laptop l = new Laptop();
		
		System.out.println(l.brand);
		System.out.println(l.model);
		System.out.println(l.price);
	}

}
//"HP", "ZX67TYQ", 75000