package com.demo.annotationdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection
{
	public static void main(String[] args)
	{
		String s="Hello";
		s.concat("World");
		System.out.println(s);	
		int i = Integer.parseInt("200i");
		System.out.println(i);
		try
		{
		Class c=Class.forName("inheritance.Developer");
		Class sClass=c.getSuperclass();
		System.out.println("Super class is "+sClass);
		
		Constructor fields[]=c.getConstructors();
		for(Constructor f:fields)
			System.out.println(f);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}