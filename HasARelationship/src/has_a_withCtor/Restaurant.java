package has_a_withCtor;

public class Restaurant{
	Menu menu;
	
	public Restaurant(Menu menu){
		this.menu = menu;
	}
	
	public void display(){
		System.out.println(menu.item);
		System.out.println(menu.price);
	}
	
	
	public static void main(String[] args){
		Menu menu1 = new Menu("Paneer", 120);
		
		Restaurant restaurant = new Restaurant(menu1);
		restaurant.display();
	}
}