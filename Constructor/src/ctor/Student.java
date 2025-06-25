package ctor;
public class Student{
	
	private String name;
	private int rollNo;
	private String email;
	private String course;
	
	public Student(String name, int rollNo,String email,String course){
		this.name = name;
		this.rollNo = rollNo;
		this.email = email;
		this.course = course;
	}
	               
	public void displayInfo(){
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(email);
		System.out.println(course);
	}
}