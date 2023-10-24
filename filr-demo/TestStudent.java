package com.demo.filedemo;

public class TestStudent
{
	public static void main(String[] args)
	{
		Address address=new Address();
		System.out.println(address);
		
		Address address2=new Address("Tuljapur", "413601");
		System.out.println(address2);
		
		Student1 student1=new Student1("ABC",new Address("PUNE", "411052"));
		System.out.println(student1);
	}
}
