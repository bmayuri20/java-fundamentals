package staticVariable;
public class A3{
	static int x;
		   int y;
	// Static and Instance variable access in static method
	
	public static void m1(){
		//  System.out.println(y);      // Not Allowed
		System.out.println(x);
		
		A3 a = new A3();
		System.out.println(a.y);
		System.out.println(a.x);
		System.out.println(A3.x);
	}
	
	// Static and Instance variable access in non-static method
	public void m2(){
		System.out.println(y);
		System.out.println(x);
		
		A3 a = new A3();
		System.out.println(a.y);
		System.out.println(a.x);
		System.out.println(A3.x);
	}
	}
