package com;
public class Employee{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	public void setEmployeeId (int employeeId){
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setDepartment(String department){
		this.department = department;
	}
	
	public int getEmployeeId(){
		return employeeId;
	}
	public String getEmployeeName(){
		return employeeName;
	}
	public double getSalary(){
		return salary;
	}
	public String getDepartment(){
		return department;
	}
}