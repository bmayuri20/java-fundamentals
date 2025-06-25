package com;
import java.util.*;
public class FindEvenNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Even Numbers are-");
		for(int i=x; i<=y; i++){
			if(i%2 == 0)
			System.out.print(i + "  ");
		
		}
	}

}