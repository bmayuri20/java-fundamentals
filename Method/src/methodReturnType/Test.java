package methodReturnType;
public class Test{
	public Student m1(){
		Student stu = new Student();
		stu.setRollNo(1);
		stu.setName("ABC");
		
		return stu;
	}
	public Employee m2(){
		Employee emp = new Employee();
		emp.setEmpId(23);
		emp.setName("PRT");
		emp.setSalary(8890.6f);
		
		return emp;
	}
	
	public static void main(String[] args){
		Test t = new Test();
		Student s = t.m1();
		Employee e = t.m2();
		
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}