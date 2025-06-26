package methodReturnType;
public class ArithmaticTask{
	public int subtract(int x , int y){
		return x-y;
	}
	
	public static void main(String[] args){
		ArithmaticTask a = new ArithmaticTask();
		int sub = a.subtract(78, 47);
		System.out.println(sub);
	}

}