package com;
import java.util.Scanner;
public class CalculatorTest{

	public static void main(String[] args){
		
		System.out.println("Enter your Choice-");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Divison");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:
			Addition addition = new Addition();
			addition.add();
		break;
		
		case 2:
		Subtraction subtraction = new Subtraction();
		subtraction.sub();
		break;
		
		case 3:
		Multiply multiply = new Multiply();
		multiply.mult();
		break;
		
		case 4:
		Divison division = new Divison();
		division.div();
		break;
		}
	}
}