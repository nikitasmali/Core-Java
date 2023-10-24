package abstractdemo;

public class ShapeMain 
{
	public static void main(String[] args) 
	{
		//Shape shape=new Shape();
		//shape.fillColor();
		//shape.draw();
		
		Shape cShape=new Circle(2.5f, "Navy Blue");
		cShape.fillColor();
		cShape.draw();
		cShape.calculateArea();
		
		Shape sShape=new Square(5.5f, "Yelollow");
		sShape.fillColor();
		sShape.draw();
		sShape.calculateArea();
		
		Shape rShape=new Rectangle(5.6f, 2.2f, "Red");
		rShape.fillColor();
		rShape.draw();
		rShape.calculateArea();
	}
}
