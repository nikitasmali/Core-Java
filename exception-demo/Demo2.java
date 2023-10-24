package com.demo.exceptiondemo;


class Employee
{
	int empId;
	String name;
	
	public Employee()
	{
		empId=7;
		name="ABC";
	}
	
	public void showEmp()
	{
		System.out.println("Employee is "+empId+" "+name);
	}
}
public class Demo2
{

	public static void main(String[] args) 
	{
	
		Employee e1=null;
		try 
		{
			e1.showEmp();
		} 
		catch (NullPointerException e)
		{
			//e.printStackTrace();
			System.err.println("Null pointer is not correct");
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

	}

}