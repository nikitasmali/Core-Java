package com.demo.annotationdemo;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnno
{
	String os();
	int band();
}

@MyAnno(os="android",band=5)
class Smartphone
{
	String model;
	int size;
	public Smartphone()
	{
		model="XPERIA";
		size=7;
	}
}
public class DemoAnno2 
{
	public static void main(String[] args) 
	{
		Smartphone s1=new Smartphone();
		System.out.println(s1.model+" "+s1.size);
		Class c=s1.getClass();
		Annotation a1=c.getAnnotation(c);
	}
}