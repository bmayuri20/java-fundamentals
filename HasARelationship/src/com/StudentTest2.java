package com;
public class StudentTest2{
	public static void main(String[] args){
		Address2 adr = new Address2("Pune", "Karve Nagar");
		
		Student2 stu = new Student2(1, "xyz", adr);
		
		System.out.println(stu.rollNo);
		System.out.println(stu.name);
		System.out.println(stu.addr.cityName);
		System.out.println(stu.addr.areaName);
	}

}  