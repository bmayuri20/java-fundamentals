package app;
// SETTER AND GETTER TASK: -

public class SchoolTest{
	public static void main(String[] args){
		School sc = new School();
		
		sc.setName("ABC");
		sc.setId(89);
		sc.setAddress("Pune");
		sc.setMobNo(888888l);
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getAddress());
		System.out.println(sc.getMobNo());
	}
	
}