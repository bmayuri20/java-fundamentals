package com;
public class Course{
	public void details(){
	String courseName = "Full Stack Java Developer";
	int fees = 80000;
	int duration = 6;
	
	System.out.println("Course Name- " + courseName );
	System.out.println("Fees- " + fees);
	System.out.println("Duration in months- " +duration );
	}
	
	public static void main (String[] args){
	Course course = new Course();
	course.details();
	}
}