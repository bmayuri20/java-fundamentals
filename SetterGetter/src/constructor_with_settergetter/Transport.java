package constructor_with_settergetter;
//Constructors With Setter & getter

public class Transport{
	public void displayBusInfo(Bus b){
		System.out.println(b.getBusNo());
		System.out.println(b.getCapacity());
		System.out.println(b.getRoute());
	}
	public void addBus(Bus b){
		displayBusInfo(b);
	}
	public static void main(String[] args){
		Bus bus = new Bus("89A", 35, "Samrudhhi");
		
		Transport t = new Transport();
		t.addBus(bus);
	}
}