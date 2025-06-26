package has_a_withCtor;
 public class House{
	Room room;
	
	public House(Room room){
		this.room = room;
	}
	public void display(){
		System.out.println(room.houseType);
		System.out.println(room.size);
	}
	public static void main(String[] args){
		Room room1 = new Room("Villa", 2000);
		
		House house = new House(room1);
		house.display();
		
	}
 
 }
 class Room{
	String houseType;
	double size;
	
	public Room(String houseType, double size){
		this.houseType= houseType;
		this.size = size;
	}
	
} 