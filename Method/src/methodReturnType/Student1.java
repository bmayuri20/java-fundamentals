package methodReturnType;
public class Student1{
	private int rollNo;
	private String name;
	private Address address;
	
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	
	public int getRollNo(){return rollNo;}
	public String getName(){return name;}
	public Address getAddress(){return address;}
}

