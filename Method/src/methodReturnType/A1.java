package methodReturnType;
public class A1{

	public static void main(String[] args){
		B1 b = new B1();
		
		System.out.println(b.m2());
	}
}

class B1{
	
	C1 c = new C1();
	
	public int m2(){
		
		return c.m1();
	}

}

class C1{
	
	public int m1(){
		return 10;
	}

}