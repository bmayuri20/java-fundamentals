package com;
import java.util.*;
public class Table2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number to print the table:");
		int num = sc.nextInt();
		
		Table2 t = new Table2();
		t.table(num);
	}
	
	
	public void table(int num){
		int i=1;
		while(i<=10){
			System.out.println(num+ " * " + i+ " = " + (num*i));
			i++;
		}
	}
	
	
}



	
		
		