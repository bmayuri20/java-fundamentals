package constructor_with_settergetter;
//Constructors With Setter & getter

public class LaptopTest{
	
	public void showLaptopInfo(Laptop l){
		System.out.println("Brand: "+l.getBrand());
		System.out.println("Model: "+l.getModel());
		System.out.println("Price: "+l.getPrice());
	}
	public static void main(String[] args){
	Laptop laptop = new Laptop("DELL", "AX6734UI", 89000);
	
	LaptopTest laptopTest = new LaptopTest();
	laptopTest.showLaptopInfo(laptop);
	
	}

}