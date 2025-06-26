package staticVariable;
public class A1{
	static int x;
		   int y;
		  
	public static void main(String[] args){
		A1 a = new A1();
		a.x = 100;
		a.y = 100;
		
		A1 a1 = new A1();
		a1.x = 300;
		a1.y = 300;
		
		System.out.println(a.x);    //300
		System.out.println(a.y);	//100
		System.out.println(a1.x);	//300
		System.out.println(a1.y);	//300
		
	}
}
// Static -- it means single copy and it belongs to class
// One copy will be shareable for all object