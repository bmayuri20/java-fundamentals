package methodReturnType;
public class A{
	int x;
	public int m1()		{return 10;}
	public String m2()	{return "Mb";}
	public float m3()	{return 15.6f;}
	public long m5()	{return 45l;}
	public char m6()	{return 'Z';}
	public boolean m7() {return true;}
	public double m8()  {return 123.67;}
	public A m4(){
		A a = new A();
		a.x =40;
		return a;
	}
	
	public static void main(String[] args){
		A a = new A();
		
		/* A g = a.m4();
		System.out.println(g.x); */
		
		System.out.println(a.m1());
		System.out.println(a.m2());
		System.out.println(a.m3());
		System.out.println(a.m4().x);
		System.out.println(a.m5());
		System.out.println(a.m6());
		System.out.println(a.m7());
		System.out.println(a.m8());
	}
	
}