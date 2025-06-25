package constructor_with_settergetter;
//Constructors With Setter & getter

public class Store{
	public void displayProductDetails(Product p){
		System.out.println(p.getPName());
		System.out.println(p.getPID());
		System.out.println(p.getPrice());
	}
	
	public void addProduct(Product p){
		displayProductDetails(p);
	}
	
	public static void main(String[] args){
		Product product = new Product("BOOK", 34, 78.98);
		
		Store store = new Store();
		store.addProduct(product);
	}
	
}