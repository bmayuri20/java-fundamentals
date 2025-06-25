package constructor_with_settergetter;
//Constructors With Setter & getter

public class Product{
	
	private String pName;
	private int pID;
	private double price;
	
	public Product(String pName,int pID,double price){
		this.pName = pName;
		this.pID = pID;
		this.price = price;
	}
	public void setPName(String pName){
		this.pName = pName;
	}
	public void setPID(int pID){
		this.pID = pID;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getPName(){return pName;}
	public int getPID(){return pID;}
	public double getPrice(){return price;}

}