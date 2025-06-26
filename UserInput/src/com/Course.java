package com;
public class Course{
	 String name;
	 int fee;
	 
	public Course(String name, int fee){
		this.name = name;
		this.fee = fee;
	}
	
	public void details(){
		System.out.println("Course Name:"+ name);
		System.out.println("Fee:"+ fee);
	}
	
 }