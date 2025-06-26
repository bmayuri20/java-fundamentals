package methodReturnType;
public class A6{

	public static void main(String[] args){
		
		B6 b = new B6();
		
		Calculator q = b.m2();
		
		System.out.println(q.getA() + q.getB());
	}
}

