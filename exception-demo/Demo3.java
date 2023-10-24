package com.demo.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream file=new FileInputStream("D:\\MyPackTest\\TestHello.java");
			System.out.println("Reading file");
			char ch=(char)file.read();
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
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