package app;
// SETTER AND GETTER TASK: -

public class Employee{
	private String name;
	private int id;
	private double salary;
	private long mobNo;
	private String address;
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setMobNo(long mobNo){
		this.mobNo = mobNo;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getName(){return name;}
	public int getId(){return id;}
	public double getSalary(){return salary;}
	public long getMobNo(){return mobNo;}
	public String getAddress(){return address;}
}