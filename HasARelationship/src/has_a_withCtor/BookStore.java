package has_a_withCtor;
class Author{
	String name;
	String nationality;
	
	public Author(String name, String nationality){
		this.name = name;
		this.nationality = nationality;
	}

}

public class BookStore{
	
	Author author;
	
	public BookStore(Author author){
		this.author = author;
	}
	
	public void display(){
		System.out.println(author.name);
		System.out.println(author.nationality);
	}
	
	public static void main(String[] args){
		Author battery1 = new Author("Chetan Bhagat", "Indian");
		
		BookStore bookStore = new BookStore(battery1);
		bookStore.display();
	}

}