package com;
import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int userName;
	
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextInt();   
	
	//System.out.println("Enter username"); 
	String Name = myObj.nextLine();
       
    System.out.println("Username is: " + userName);     
    System.out.println("Username is: " + Name);  	
    
    myObj.close();
  }
}

         