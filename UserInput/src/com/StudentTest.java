package com;
import java.util.Scanner;
public class StudentTest{
	public void display(Student stu){
		System.out.println(stu.getRollNo());
		System.out.println(stu.getName());
	}
	public static void main(String[] args){
		StudentTest s = new StudentTest();
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rollno and name");
		stu.setRollNo(sc.nextInt());
		stu.setName(sc.next());
		
		s.display(stu);
		sc.close();
	}
}