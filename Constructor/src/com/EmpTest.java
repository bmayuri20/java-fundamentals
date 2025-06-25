package com;
public class EmpTest{
	public static void main(String[] args){
		
		Emp e1 = new Emp(1, "Ramesh");
		System.out.println(e1.id + e1.name);
		
		Emp e2 = new Emp(2, "Suresh");
		System.out.println(e2.id + e2.name);
		
		Emp e3 = new Emp(3, "Rajesh");
		System.out.println(e3.id + e3.name);
	}

}