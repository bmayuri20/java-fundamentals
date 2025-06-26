package methodReturnType;
public class A2{

	public static void main(String[] args){
		
		System.out.println(B2.m2());
	}
}

class B2{
	
	public static int m2(){
		
		return C2.m1();
	}
}

class C2{
	
	public static int m1(){
		
		return 10;
	}

}