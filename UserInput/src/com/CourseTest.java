package com;
import java.util.Scanner;
public class CourseTest{

	public static void main(String args[ ])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course Name:");
		String cName = sc.nextLine();
		
		System.out.println("Enter Fee:");
		int fee = sc.nextInt();
		
		Course c = new Course(cName, fee);
		c.details();
		sc.close();
	}
}