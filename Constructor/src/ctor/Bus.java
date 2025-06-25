package ctor;
public class Bus{
	private String busNo;
	private int capacity;
	private String route;
	
	public Bus(String busNo, int capacity, String route){
		this.busNo = busNo;
		this.capacity = capacity;
		this.route = route;
	}
	
	public void displayBusInfo(){
		System.out.println(busNo);
		System.out.println(capacity);
		System.out.println(route);
	}

}