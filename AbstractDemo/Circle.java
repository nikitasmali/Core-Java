package abstractdemo;

import finalVariable.Printable;

public class Circle extends Shape implements Printable
{
	float radius;
	
	public Circle()
	{
		radius=3.2f;
	}
	
	public Circle(float radius, String color)
	{
		super(color);
		this.radius=radius;
	}

	public void setRadius(float radius)
	{
		this.radius = radius;
	}

	public float getRadius() 
	{
		return radius;
	}


	@Override
	public void draw() 
	{
		System.out.println("Drawing Is Circle....!");
	}

	@Override
	public void calculateArea()
	{
		System.out.println("Area of cirle="+(3.14 * radius * radius));
	}
	//add diameter method

	@Override
	public void printData()
	{
		System.out.println("Circle...");
		
	}
}



