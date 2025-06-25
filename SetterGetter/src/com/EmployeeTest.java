package com;
public class EmployeeTest{
	public static void main(String[] args){
		
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("XYZ");
		e1.setSalary(8655.54);
		e1.setDepartment("IT");
		
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDepartment());
	}
}