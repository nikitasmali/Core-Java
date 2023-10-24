package com.demo.exceptiondemo;

import java.io.IOException;

public class Demo7 
{
	public static void divideIt()
	{
		int num=20,div=0;
		int result = 0;
		if(div==0)
			throw new ArithmeticException("Division by zero not possible");//we can throw only one object of any class or related object to be thrown
		result = num/div;
		System.out.println("Result="+result);
	}
	
	public static void main(String[] args) 
	{	
		try
		{
			divideIt();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
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
		System.out.println("Application run Successfully ");
	}
}