package methodReturnType;
public class A4{
	public static void main(String[] args){
		
		B4.m1(10);
	}
}

 class B4{
	public static void m1(int x){
		
		C4.m2(x);
	}

}

 class C4{
	public static void m2(int y){
		System.out.println(y);
	}
}