package app;
// SETTER AND GETTER TASK: -

public class School{
	private String name;
	private int id;
	private String address;
	private long mobNo;
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setMobNo(long mobNo){
		this.mobNo = mobNo;
	}
	
	public String getName(){return name;}
	public int getId(){return id;}
	public String getAddress(){return address;}
	public long getMobNo(){return mobNo;}
}

