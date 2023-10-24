package overloading;

public class Rectangle 
{
	private int width;
	private int height;
	
	Rectangle()
	{
		width=10;
		height=12;
	}
	Rectangle(int width,int height)
	{
		width= this.width;
		height=this.height;
	}
	public void printDetails()
	{
		System.out.println("width:"+width+"\nHeight:"+height);
	}
}
