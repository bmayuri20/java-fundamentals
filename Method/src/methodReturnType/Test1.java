package methodReturnType;
public class Test1{
	public Student1 m1(){
		Address adr = new Address();
		adr.setCityName("Pune");
		adr.setAreaName("Ravet");
		
		Student1 stu = new Student1();
		stu.setRollNo(23);
		stu.setName("PRT");
		stu.setAddress(adr);
		
		return stu;
	}
	
	
	public static void main(String[] args){
		Test1 t = new Test1();

		Student1 s = t.m1();
		
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		System.out.println(s.getAddress().getCityName());
		System.out.println(s.getAddress().getAreaName());
		
	}
}