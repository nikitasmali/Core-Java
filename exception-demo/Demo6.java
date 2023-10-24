package com.demo.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo6
{
	public static void readFile() throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\MyPackTest\\TestHello.java");
		System.out.println("Reading file");
		
		int ch=file.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=file.read();
		}
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			readFile();
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