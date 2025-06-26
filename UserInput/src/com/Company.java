package com;
import java.util.Scanner;

public class Company{
	Scanner sc = new Scanner(System.in);
	
	public void manager(){
		System.out.println("Enter name, salary, experience");
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		
	}
	public void employee(){
		System.out.println("Enter name, salary, experience");
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
	}
	
	public static void main(String[] args){
		Company copm = new Company();
		copm.manager();
		copm.employee();
	}
}