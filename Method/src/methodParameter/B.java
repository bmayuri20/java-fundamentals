package methodParameter;
class B{
	
	public void display(int x){
		System.out.println(x);
	}
	
	public static void main(String[] args){
		B a =  new B();
		a.display(100);
	}
}