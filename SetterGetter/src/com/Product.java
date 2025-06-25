package com;
public class Product{
	private int Id;
	private String name;
	private double price;
	private String descp;
	
	public void setId(int Id)                {this.Id = Id; }
	public void setName(String name)         {this.name = name;}
	public void setPrice(double price)       {this.price = price;}
	public void setDescription(String descp) {this.descp = descp;}
	
	public int getId()             {return Id;}
	public String getName()        {return name;}
	public double getPrice()       {return price;}
	public String getDescription() {return descp;}
	

}