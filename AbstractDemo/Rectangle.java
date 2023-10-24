package abstractdemo;

public class Rectangle extends Shape
{
	float length;
	float width;
	
	public Rectangle()
	{
		length=3.4f;
		width=4.5f;
	}
	public Rectangle(float length, float width, String color){
		super(color);
		this.length=length;
		this.width=width;
	}
	public void setLength(float length) 
	{
		this.length = length;
	}

	public float getLength()
	{
		return length;
	}
	public void setWidth(float width)
	{
		this.width = width;
	}
	public float getWidth()
	{
		return width;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing Is Rectangle....!");
	}

	@Override
	public void calculateArea()
	{
		System.out.println("Area of Rectangle="+(length * width));
	}
}
