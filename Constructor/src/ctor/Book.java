package ctor;
public class Book{
	String title;
	String author;
	String genre;
	
	public Book(String title, String author, String genre){
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	
	public void display(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(genre);
	}
}