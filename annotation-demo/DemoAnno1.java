package com.demo.annotationdemo;

class A
{
	public void showMetodInsideThisClass()
	{
		System.out.println("Inside A");
	}
}
class B extends A
{
	@Override                   //Pre-defined Annotation
	public void showMetodInsideThisClass()
	{
		System.out.println("Inside B");
	}
}


public class DemoAnno1 
{
	public static void main(String[] args)
	{
		B b=new B();
		b.showMetodInsideThisClass();
	}
}