package methodParameter;
import java.util.Scanner;
public class NumberChecker{
	public void isPositive(int x){
		if(x >= 0)
			System.out.println("Positive");
		else 
			System.out.println("Negative");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a Number");
		
		NumberChecker n = new NumberChecker();
		n.isPositive(sc.nextInt());
	}
		
}