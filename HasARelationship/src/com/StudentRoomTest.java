package com;
public class StudentRoomTest{
	public static void main(String[] args){
		Student4 stu = new Student4();
		stu.name = "ABC";
		stu.rollno = 2;
		stu.email = "abc@";
		
		Classroom classroom = new Classroom();
		
		classroom.name = "PQR";
		classroom.capacity = 50;
		classroom.student = stu;
		
		System.out.println(classroom.name);
		System.out.println(classroom.capacity);
		System.out.println(classroom.student.name);
		System.out.println(classroom.student.rollno);
		System.out.println(classroom.student.email);
		
}

}