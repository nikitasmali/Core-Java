package com.demo.myapp;

import java.io.Serializable;

public class Student implements Serializable
{
	private int rollNo;
	private String name;
	private double percentage;
	
	public Student()
	{
		rollNo = 111;
		name = "XYZ";
		percentage = 98;
	}
	public Student(int rollNo2, String name2, double percentage2)
	{
		this(3, 98.5, "ABC");	
	}
	
	public Student(int rollNo, double percentage,String name)
	{
		this.rollNo=rollNo;
		this.percentage=percentage;
		this.name=name;
	}

	public void setRollno(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public int getRollno()
	{
		return rollNo;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPercentage(double newPercentage)
	{
		this.percentage = newPercentage;
	}
	
	public double getPercentage()
	{
		return percentage;
	}

	@Override
	public String toString()
	{
		
		return "RollNo= "+rollNo+" Name= "+name+" Percentage="+percentage;
	}
}
