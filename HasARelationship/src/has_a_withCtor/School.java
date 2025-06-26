package has_a_withCtor;
public class School{
	String schoolName;
	Student student;
	
	public School(String schoolName, Student student){
		this.schoolName = schoolName;
		this.student = student;
	}
	
	public void display(){
		System.out.println(schoolName);
		System.out.println(student.name);
		System.out.println(student.grade);
	}	
	public static void main(String[] args) {
		Student s1 = new Student("ABC", 4);
		
		School school = new School("NEJC", s1);
		school.display();
	}
}