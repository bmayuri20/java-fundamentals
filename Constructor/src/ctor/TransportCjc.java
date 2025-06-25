package ctor;
public class TransportCjc{
	
	
	
	public void addBus(Bus b){
		b.displayBusInfo();
	}
	public static void main(String[] args){
		Bus b = new Bus("123", 30, "DP Road");
		
		TransportCjc t = new TransportCjc();
		t.addBus(b);
		
	}
}