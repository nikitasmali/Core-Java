package staticImport;

import static shapes.Circle.PI;
import static shapes.Circle.getPI;
import shapes.Circle;
public class ShapeMain
{
	public static void main(String[] args) 
	{
		System.out.println("Value of PI="+getPI());
		System.out.println("Value of PI="+PI);
		
		Circle circle=new Circle();
		System.out.println(circle);
	}

}
