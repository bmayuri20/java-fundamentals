package ctor;
public class School{
	
	public void addStudent(Student s){
		s.displayInfo();
	}
	
	public static void main(String[] args){
		Student st = new Student("xyz", 1, "xyz@gmail.com","Computer");
		
		School sc = new School();
		sc.addStudent(st);
	}

}