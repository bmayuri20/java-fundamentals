package staticVariable;
public class A2{
	static int x;
		   int y;
		  
	public static void main(String[] args){
		A2 a = new A2();
		a.x = 100;
		a.y = 100;
		
		A2 a1 = new A2();
		a1.x = 50;
		a1.y = 50;
		
		A2 a2 = new A2();
		
		System.out.println(a.x);    //50
		System.out.println(a.y);	//100
		System.out.println(a1.x);	//50
		System.out.println(a1.y);	//50
		System.out.println(a2.x);	//50
		System.out.println(a2.y);	//0
	}
}



