package constructor_with_settergetter;
//Constructors With Setter & getter
public class Laptop{
	private String brand;
	private String model;
	private double price;
	
	public Laptop(){
		this.brand = "HP";
		this.model = "ZXY894TR";
		this.price = 56000;
	}
	
	public Laptop(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getBrand(){return brand;}
	public String getModel(){return model;}
	public double getPrice(){return price;}
	
}
