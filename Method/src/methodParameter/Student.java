package methodParameter;
public class Student{
	private int rollNo;
	private String name;
	
	public void setRollno(int rollNo){
		this.rollNo = rollNo;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){return name;}
	public int getRollno(){return rollNo;}
}