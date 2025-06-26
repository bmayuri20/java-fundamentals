package methodReturnType;
public class InterestCalc{
	
	public double simpleInt(double p, float r, int t ){
		return (p*r*t)/100;
	}
	public static void main(String[] args){
		InterestCalc calc = new InterestCalc();
		double si = calc.simpleInt(1000,2,6);
		
		System.out.println("Simple Int = "+ si);
}
}