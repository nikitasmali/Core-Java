package com.demo.java8;

public class Demo3 //Implementation of interface as anonymous inner class
{
	public static void main(String[] args)
	{
		MyInterface d1= new MyInterface()
		{
			@Override
			public void show() 
			{
				System.out.println("Inside show");
			}
		};
		d1.show();
	}
}
