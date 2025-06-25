package constructor_with_settergetter;
//Constructors With Setter & getter

public class Student{
	private String name;
	private int rollNo;
	private String email;
	private String course;
	
	public Student(String name, int rollNo, String email, String course){
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
		this.course = course;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setCourse(String course){
		this.course = course;
	}
	
	public String getName(){return name;}
	public int getRollNo(){return rollNo;}
	public String getEmail(){return email;}
	public String getCourse(){return course;} 
}