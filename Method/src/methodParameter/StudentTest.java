package methodParameter;
public class StudentTest{
	public void display(Student s){
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
	
	public static void main(String[] args){
		StudentTest st = new StudentTest();
		Student a = new Student();
		a.setRollno(1);
		a.setName("xyz");
		
		st.display(a);
		
		Student b = new Student();
		b.setRollno(2);
		b.setName("abx");
		
		st.display(b);
	}
}
		