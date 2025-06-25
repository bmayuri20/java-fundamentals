package ctor;
public class LaptopTest{

	public static void main(String[] args){
		Laptop m1 = new Laptop();
		m1.showLaptopInfo();
		
		Laptop m2 = new Laptop("HP", "ZX67TYQ", 75000);
		m2.showLaptopInfo();
		
	}
	
	

}
