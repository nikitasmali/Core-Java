package com.demo.exceptiondemo;

class NegativeNumber extends Exception
	{
		public NegativeNumber(String msg)
		{
			super(msg);
		}
	}
	
public class FactorialDemo
	{
		public static void factorial(int i) throws NegativeNumber
		{
			if(i <0)
			{
				throw new NegativeNumber("Number is negative");
			}
			int fact=1;
			int num=5;
			for(i=1;i<=num;i++)
			{
				fact = fact * i;
			}
			System.out.println("Factorial of "+num+"="+fact);
		}
		
		public static void main(String[] args) 
		{
			try
			{
				factorial(-5);  //it will give exception for negative number
			}
			catch(NegativeNumber e)
			{
				e.printStackTrace();
			}
			
			try
			{
				factorial(5);  //for positive number works fine
			}
			catch(NegativeNumber e)
			{
				e.printStackTrace();
			}
		}
}

