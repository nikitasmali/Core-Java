package overloading;

public class Multiply
{
	public void multiply(int n1,int n2)
	{
		System.out.println(n1 * n2);
	}
	
	public void multiply(float n1,int n2)
	{
		System.out.println(n1 * n2);
	}
	
	public void multiply(double n1,int n2)
	{
		System.out.println(n1 * n2);
	}
	public void multiply(double n1,int n2,int n3)
	{
		System.out.println(n1 * n2 * n3);
	}
}
