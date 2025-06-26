package methodParameter;
public class A{
	int x;
	public A(){
	
	}
	public A(int x){
		this.x = x;
	}
	public void display(){
		System.out.println(x);
	}
	
	public static void main(String[] args){
		A a =  new A();
		a.x = 100;
		a.display();
	}
}