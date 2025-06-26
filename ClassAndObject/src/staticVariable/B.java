package staticVariable;
public class B{
	static int count = 1;
	
	public static void display(){
		System.out.println("Static method"+ count);
	}
	
	public B(){
		System.out.println("Constructor");
	}
	
	public void displayInfo(){
		System.out.println("non-static method");
	}
	static{
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
	public static void main(String[] args){
		System.out.println("main start");
		B b = new B();
		B b1 = new B();
	}	
}
//start block is executed at the class loading time(at compile time(javac fileName.java))
//instance block executed before the constructor...As many times c'tor called that many times instance block will be executed
// flow of execution - static variable or blocks
//					 - main
//					 - Instance block when object is created(A a = new A())
//					 - constructor (called at the time of object creation)
//					 - methods (whatever return inside the main)
// from 1.7 version static block does not executed without main (main is mandatory)