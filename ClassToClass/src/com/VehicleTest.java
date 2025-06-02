package com;
class TwoWheeler{
	public void twoWheeler()
		{System.out.println("Two-Wheeler");}
}

class ThreeWheeler{
	public void threeWheeler()
		{System.out.println("Three-Wheeler");}
} 

class FourWheeler {
	public void fourWheeler()
		{System.out.println("Four-Wheeler");}
}

class SixWheeler {
	public void sixWheeler()
		{System.out.println("Six-Wheeler");}
}

class EightWheeler {
	public void eightWheeler()
		{System.out.println("Eight-Wheeler");}
}

public class VehicleTest{		
	public static void main(String[] args)
		{
			TwoWheeler t2 = new TwoWheeler();
			t2.twoWheeler();
			
			ThreeWheeler t3 = new ThreeWheeler();
			t3.threeWheeler();
			
			FourWheeler t4 = new FourWheeler();
			t4.fourWheeler();
			
			SixWheeler t6 = new SixWheeler();
			t6.sixWheeler();
			
			EightWheeler t8 = new EightWheeler();
			t8.eightWheeler();
			
		}
}