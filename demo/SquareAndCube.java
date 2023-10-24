package demo;

public class SquareAndCube
{
	private int num,square,cube;
	
	public void initValues()
	{
		num = 7;
		square = num * num;
		cube = num * num * num;
	}
	
	public void showResult()
	{
		System.out.println("Square="+square+"\nCube="+cube);
	}
}
