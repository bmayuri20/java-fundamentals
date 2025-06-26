package com;
public class StudentTest1{
	public static void main(String[] args){
		Address1 adr = new Address1();
		adr.cityName = "Pune";
		adr.areaName = "KarveNagar";
		// System.out.println("---"+adr);
		
		Student1 stu = new Student1();
			stu.rollNo = 1;
			stu.name = "xyz";
		// System.out.println(stu.adr);
			stu.addr = adr;
		// System.out.println(stu.adr);
		
		System.out.println(stu.rollNo);
		System.out.println(stu.name);
		System.out.println(stu.addr.cityName);
		System.out.println(stu.addr.areaName);
	}
}