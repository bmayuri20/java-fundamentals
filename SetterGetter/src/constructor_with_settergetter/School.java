package constructor_with_settergetter;
//Constructors With Setter & getter

public class School{
	public void displayInfo(Student stu){
		System.out.println(stu.getName());
		System.out.println(stu.getRollNo());
		System.out.println(stu.getEmail());
		System.out.println(stu.getCourse());
	}
	public void addStudent(Student stu){
		displayInfo(stu);
	}
	public static void main(String[] args){
		Student student = new Student("PYT", 2, "pyt@gmail", "CS");
		
		School school = new School();
		school.addStudent(student);
	}
}