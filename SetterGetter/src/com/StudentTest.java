package com;
public class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student();
			s1.setRollno(1);
			s1.setName("abc");
			s1.setGrade('A');
			
		Student s2 = new Student();
			s2.setRollno(2);
			s2.setName("qwe");
			s2.setGrade('B');
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s1.getGrade());
		System.out.println();
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		System.out.println(s2.getGrade());
	}

}