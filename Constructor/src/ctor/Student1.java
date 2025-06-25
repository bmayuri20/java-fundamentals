package ctor;
public class Student1{
	String name;
	int age;
	int grade;
	
	public Student1(String name, int age, int grade){
		this.name = name;
		this.age = age;
		this.grade  = grade;
	}
	public void display(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(grade);
	}
}