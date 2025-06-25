package constructor_with_settergetter;
//Constructors With Setter & getter

public class Bus{
	private String busNo;
	private int capacity;
	private String route;
	
	public Bus(String busNo,int capacity,String route){
		this.busNo = busNo;
		this.capacity = capacity;
		this.route = route;
	}
	public void setBusNo(String busNo){
		this.busNo = busNo;
	}
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public void setRoute(String route){
		this.route = route;
	}
	
	public String getBusNo(){return busNo;}
	public int getCapacity(){return capacity;}
	public String getRoute(){return route;}
}