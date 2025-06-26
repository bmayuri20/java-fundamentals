package methodReturnType;
public class A3{
	public static void main(String[] args){
		B3 b = new B3();
		
		b.m1(10);
	}
}

 class B3{
	public void m1(int x){
		
		C3 c = new C3();
		
		c.m2(x);
	}

}

 class C3{
	public void m2(int y){
	
		System.out.println(y);
	}
}