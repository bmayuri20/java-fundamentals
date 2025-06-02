package com;
public class Rto{

	public void registerVehicle( ) 
		{ System.out.println(" Your Vehicle is registered"); }
	
	public void deleteVehicle( )
		{ System.out.println(" Your Vehicle is deleted"); }
	
	public static void main(String[] args){
	Rto rto = new Rto();
	rto.registerVehicle();
	rto.deleteVehicle();
	}
}