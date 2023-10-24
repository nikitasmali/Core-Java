package abstractdemo;

public class Square extends Shape
{
	float side;
	
	
	public Square()
	{
		side = 4.5f;
	}
	
	public Square(float side, String color)
	{
		super(color);
		this.side=side;
	}
	
	public void setSide(float side) {
		this.side = side;
	}
	public float getSide() {
		return side;
	}


	@Override
	public void draw()
	{
		System.out.println("Drawing Is Square....!");
	}

	@Override
	public void calculateArea()
	{
		System.out.println("Area of Square="+(side * side));
	}
	
}