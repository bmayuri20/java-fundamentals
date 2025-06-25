package ctor;
public class Store{
	
	public void addProduct(Product p){
		p.displayProductDetails();	
	}
	
	public static void main(String[] args){
		Product p = new Product("Chocolates", 123, 90.66);
		
		Store s = new Store();
		s.addProduct(p);
	}

}