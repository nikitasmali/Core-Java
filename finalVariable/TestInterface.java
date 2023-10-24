package finalVariable;

import abstractdemo.Circle;

public class TestInterface 
{
	public static void main(String[] args)
	{
		Printable printable=new MyDate();
		printable.printData();
		
		Printable printable2=new Circle();
		printable2.printData();
	}
}
