package com;
class Rectangle
{
	public void area()
	{System.out.println("Area of Rectangle = length * breadth");}
}

public class RectangleTest{
	public static void main (String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.area();
	}
}