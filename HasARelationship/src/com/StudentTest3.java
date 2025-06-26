package com;
public class StudentTest3{
	public static void main(String[] args){
		
		Address3 adr = new Address3();
		adr.setCityName("Pune");
		adr.setAreaName("Karve NAgar");
		
		Student3 stu = new Student3();
		stu.setRollNo(1);
		stu.setName("PQR");
		stu.setAddress(adr);
		
		System.out.println(stu.getRollNo());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress().getCityName());
		System.out.println(stu.getAddress().getAreaName());
	
	}
	}