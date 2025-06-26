package methodParameter;
public class IntegerReverse{

	public static void main(String[] args){
		IntegerReverse rev = new IntegerReverse();
		rev.reverseInt(1234);
	}
	
	public void reverseInt(int num){
		int rev = 0;
		while(num != 0){
			int remainder  = num % 10;
			rev = rev *10 + remainder;
			num /= 10; 
		}
		System.out.println(rev);
	}
}