package methodParameter;
public class InterestCalculator{
	public void calculateSI(double p, float r, int t){
		double SI = (p * r * t)/100;
		System.out.println("Simple Interest = " + SI);
	
	}
	public static void main(String[] args){
		InterestCalculator calci = new InterestCalculator();
		calci.calculateSI(1000, 7, 3);
	}
}