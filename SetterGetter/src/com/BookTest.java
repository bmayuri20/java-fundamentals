package com;
public class BookTest{
	
	public static void main(String[] args){
		Book b = new Book();
		
		b.setTitle("IKIGAI");
		b.setAuthor("XYZ");
		b.setIsbn("13456");
		b.setPrice(300);
		
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getIsbn());
		System.out.println(b.getPrice());
	}

}