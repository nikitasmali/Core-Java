package abstractdemo;

public abstract class Shape 
{
	String color;
	
	public Shape()
	{
		color="Black";
	}
	public Shape(String color)
	{
		this.color=color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void fillColor()
	{
		System.out.println("It is filled with "+color+" Color");
	}
	
	public abstract void draw();
	public abstract void calculateArea(); 
}