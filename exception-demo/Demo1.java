package com.demo.exceptiondemo;

public class Demo1
{
	public static void main(String[] args)
	{
		int []arr = {2,34,56,7,35};
		
		try
		{
			for(int i=0; i<=arr.length;i++) 
			System.out.println(arr[i]);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.err.println("Array index is not correct");	//err for giving error messages
		}
		
		int num1 = 23,num2 = 43;
		if(num1 > num2)
		{
			System.out.println("Num1 is greater than num2");
		}
		else
		{ 
			System.out.println("Num2 is greater than num1");
		}
	}
}
