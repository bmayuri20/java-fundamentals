package com;
class Rto{

	public void registerVehicle( ) 
		{ System.out.println(" Your Vehicle is registered"); }
	
	public void deleteVehicle( )
		{ System.out.println(" Your Vehicle is deleted"); }
}

public class RtoTest{
	public static void main(String[] args){
	Rto rto = new Rto();
	rto.registerVehicle();
	rto.deleteVehicle();
	}
}