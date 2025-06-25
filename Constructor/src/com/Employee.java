package com;
// Non-Parameterized ctor practice
public class Employee{
	int id;
	String name;
	int salary;
	String designation;
	
	public Employee(){
		int id = 1111;
		String name = "MAyuri";
		int salary = 70000;
		String designation = "Full Stack JAva Developer";
	}
	
	public static void main(String[] args){
		Employee e = new Employee();
		System.out.println("ID = " + e.id);
		System.out.println("Name = " + e.name);
		System.out.println("Salary = " + e.salary);
		System.out.println("Designation = " + e.designation);
		
	}
	
	}
	