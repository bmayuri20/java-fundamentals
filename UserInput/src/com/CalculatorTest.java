package com;
import java.util.Scanner;

public class CalculatorTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calculator calc = new Calculator();
		calc.add(a, b);
		calc.sub(a, b);
		calc.div(a, b);
		calc.mul(a, b);
		
		sc.close();
	}

}