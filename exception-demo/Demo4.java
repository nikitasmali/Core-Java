package com.demo.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4 
{

	public static void main(String[] args)
	{

		try 
		{
			int []arr={23,45,67,42,12};
			for(int i=0; i<=arr.length;i++) 
			System.out.println(arr[i]);
		
		
			Employee e1=null;
			e1.showEmp();
		
			FileInputStream file=new FileInputStream("D:\\MyPackTest\\TestHello.java");
			System.out.println("Reading file");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
			System.err.println("Array index is not correct");	//err for giving error messages
		}
		
		catch (NullPointerException e)
		{
			//e.printStackTrace();
			System.err.println("Null pointer is not correct");
		}
		
		catch (FileNotFoundException e) 
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