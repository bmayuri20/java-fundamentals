package methodParameter;
public class Rectangle{
	public void calculatePerimeter(double length, double width){
		System.out.println("Perimeter= " + 2 * (length + width));
	}
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.calculatePerimeter(10,20);
	}

}