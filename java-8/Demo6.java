package com.demo.java8;

interface InterfaceTest2
{
	void show();
	default void display() //default will have implementation
	{
		System.out.println("Inside display");
	}
}

public class Demo6
{
	public static void main(String[] args)
	{
		InterfaceTest2 i1 = new InterfaceTest2() 
		{
			@Override
			public void show()
			{
				System.out.println("Inside show");
			}
		};
		i1.display();
		i1.show();
	}
}