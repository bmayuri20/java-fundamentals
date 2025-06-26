package methodReturnType;
public class IntegerReverse{
	public int reverse(int num){
		int rev = 0;
		while(num != 0){
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}
	
	public static void main(String[] args){
		IntegerReverse rev = new IntegerReverse();
		int revNum = rev.reverse(1234);
		
		System.out.println(revNum);
	}
}