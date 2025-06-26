package has_a_withCtor;
class Battery{
	int capacity;
	String type;
	
	public Battery(int capacity, String type){
		this.capacity = capacity;
		this.type = type;
	}

}

public class Phone{
	
	Battery battery;
	
	public Phone(Battery battery){
		this.battery = battery;
	}
	
	public void display(){
		System.out.println(battery.capacity);
		System.out.println(battery.type);
	}
	
	public static void main(String[] args){
		Battery battery1 = new Battery(5000, "Li-ion");
		
		Phone phone = new Phone(battery1);
		phone.display();
	}

}