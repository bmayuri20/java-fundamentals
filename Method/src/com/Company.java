package com;
public class Company{

	public void manager(){
		String name = "Ramesh Kumar";
		double salary = 100000;
		int exp = 10;
		int age = 35;
		String department = "HR";
		
		System.out.println("\nName- "+name+ "\nSalary- "+salary +
		"\nExperience in years- " +exp +"\nAge- "+age +"\nDepartment- "
		+department );
		
		
	}
	
	public void employee(){
		String name = "Suresh Kumar";
		double salary = 50000;
		String city = "Pune";
		int age = 25;
		String department = "IT";
		
		System.out.println("\nName- "+name+ "\nSalary- "+salary +
		"\nCity- "+city +"\nAge- "+age +"\nDepartment- "
		+department );
	
	}
	
	public static void main(String[] args){
		Company company = new Company();
		company.manager();
		company.employee();
	}
}