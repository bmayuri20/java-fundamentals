package has_a_withCtor;

public class Library{
	Book book;
	public Library(Book book){
		this.book = book;
	}
	
	
	public static void main(String[] args){
		Book b = new Book("Mrutunjay", "Karn");
		
		Library lib = new Library(b);
		
		System.out.println(lib.book.title);
		System.out.println(lib.book.author);
	}
}