package Array;

public class Demo
{
	public static void main(String[] args)
	{
		int a1[]={23,45,67,54};   //1st way
		
		//we can declare/write array in both the way
		int a2[]=new int[5];
		a2[0]=23;
		a2[1]=45;
		a2[2]=67;
		a2[3]=5;
		a2[4]=8;   //second way
		
		System.out.println("No. of elements in array are:"+a1.length);
		
		for(int i = 0; i < a1.length; i++)
		{
			System.out.println(a1[i]);
		}
		
		
		System.out.println("No. of elements in array are:"+a2.length);
		
		for(int i = 0; i < a2.length; i++)
		{
			System.out.println(a2[i]);
		}
		
	}
}
