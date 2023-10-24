package shapes;

import static java.lang.Math.PI;
public class Circle 
{
	private double radius;
	public static float PI;
	static
	{
		PI = 3.14f;
	}
	public Circle()
	{
		radius=1.3;
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	
	public static void setPI(float pI)
	{
		PI = pI;
	}
	public static float getPI() 
	{
		return PI;
	}
	
	@Override
	public String toString()
	{
		return "It is a circle of radius="+this.radius;
	}
}