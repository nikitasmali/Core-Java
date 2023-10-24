package parameterpassing;

public class Demo 
{
	public static int add(int i,int j)
	{
		return i+j;
	}
	
	
		
	public static void main(String[] args)
	{
		int i = 23,j = 25;
		int total=add(i, j);
		System.out.println("Total="+total);
	}
}
