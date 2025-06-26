package methodReturnType;
public class Rectangle{
	public double calciPerimeter(double length, double width){
		return 2*(length + width);
	}
	
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		double perimeter = rect.calciPerimeter(20,30);
		
		System.out.println("Perimeter="+ perimeter);
	}

}