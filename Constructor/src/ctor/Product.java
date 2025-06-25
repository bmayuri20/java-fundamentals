package ctor;
public class Product{
	
	private String productName;
	private int productID;
	private double price;
	
	public Product(String productName, int productID, double price){
		this.productName = productName;
		this.productID = productID;
		this.price = price;
	}
	
	
	public void displayProductDetails(){
		System.out.println(productName);
		System.out.println(productID);
		System.out.println(price);
		
	}

}