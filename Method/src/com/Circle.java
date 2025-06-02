package com;
public class Circle{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		circle.area();
	}
	
	public void area(){
	float r = 5.4f;
	float cArea = (float)(3.14*r*r);
	System.out.println("Area of circle = " + cArea );
	}

}