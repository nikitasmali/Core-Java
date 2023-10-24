package com.demo.innerdemo;

import java.util.Scanner;

public class DemoScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an int");
		int i=sc.nextInt();
		System.out.println(i);
		
		System.out.println("Enter double");
		double j=sc.nextDouble();
		System.out.println(j);
		
		System.out.println("Enter a String");
		String string=sc.next();
		System.out.println(string);		
	}
}
