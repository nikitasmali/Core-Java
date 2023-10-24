package varArgs;

public class VarArgsDemo
{
	public int add(int...collection)
	{
	   int sum = 0;
	   for(int i:collection)
		   sum += i;
	   		return sum;
	}
	public static void main(String[] args) 
	{
		VarArgsDemo d1=new VarArgsDemo();
		System.out.println("Addition="+d1.add(2+3));
		System.out.println("Addition="+d1.add(2+3+4));
		System.out.println("Addition="+d1.add(2+3+5+4));
	}
}
