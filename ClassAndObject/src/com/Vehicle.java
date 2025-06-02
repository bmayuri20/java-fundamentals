package com;
public class Vehicle{
	public void twoWheeler()
		{System.out.println("Two-Wheeler");}
	
	public void threeWheeler()
		{System.out.println("Three-Wheeler");}
		
	public void fourWheeler()
		{System.out.println("Four-Wheeler");}
	
	public void sixWheeler()
		{System.out.println("Six-Wheeler");}
	
	public void eightWheeler()
		{System.out.println("Eight-Wheeler");}
		
	public static void main(String[] args)
		{
			Vehicle vehicle = new Vehicle();
			vehicle.twoWheeler();
			vehicle.threeWheeler();
			vehicle.fourWheeler();
			vehicle.sixWheeler();
			vehicle.eightWheeler();
		}
}