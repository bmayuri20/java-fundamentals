package com;
public class Book{
	private String title;
	private String author;
	private String isbn;
	private double price;
	
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public String getIsbn() {return isbn;}
	public double getPrice() {return price;}
}