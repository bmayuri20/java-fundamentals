package com;
public class CompEmpTest{
	public static void main(String[] args){
	
		Employee emp = new Employee();
		
		emp.id = 1;
		emp.name = "ABC";
		emp.position = "Developer";
		
		Company comp =new Company();
		
		comp.companyName = "Google";
		comp.companyLocation = "Washington";
		comp.companyType = "Service";
		comp.employee = emp;
		
		System.out.println(comp.companyName);
		System.out.println(comp.companyLocation);
		System.out.println(comp.companyType);
		System.out.println(comp.employee.id);
		System.out.println(comp.employee.name);
		System.out.println(comp.employee.position);
	
	}
	
}