package overloading;

public class MathOperation 
{
	public void add(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	
	public void add(float n1,int n2)
	{
		System.out.println(n1+n2);
	}
	
	public void add(float n1,int n2,double n3)
	{
		System.out.println(n1+n2+n3);
	}

	public static void main(String[] args)
	{
		MathOperation m1=new MathOperation();
		m1.add(8, 9);
		m1.add(2.5f, 1);
		m1.add(2.5f, 1, 2.5);
	}
}

