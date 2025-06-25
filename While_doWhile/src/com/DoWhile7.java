package com;
public class DoWhile7{
	
	public static void main(String[] args){
		DoWhile7 dw = new DoWhile7();
		dw.print(12340567);
	}
	
	public void print(int num){
		int counter = 0;
		
		do{
		num = num / 10;
		counter ++;
		}while(num != 0);
		System.out.println("Count = "+ counter);
	}
	
}