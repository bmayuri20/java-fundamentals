package methodReturnType;
import java.util.Scanner;

public class NumChecker{
	public boolean isPositive(int x){
		if(x > 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		NumChecker num = new NumChecker();
		System.out.println(num.isPositive(sc.nextInt()));
		
		sc.close();
	}
}