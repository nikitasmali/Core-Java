package com.demo.threaddemo;

//first way of creating thread using extend thread
public class SimpleThread extends Thread
{
	@Override
	public void run()
	{
		if(Thread.currentThread().getName().equals("First"))
		{
			for(int i=0;i<5;i++)
				System.out.println("Hi Thread One...." +i+ " " +Thread.currentThread().getName());
		}
		
		if(Thread.currentThread().getName().equals("Second"))
		{
			for(int i=0;i<5;i++)
				System.out.println("Hi Thread Two...." +i+ " " +Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args)
	{
		SimpleThread sThread=new SimpleThread();
		sThread.start();
		sThread.setName("First");
		SimpleThread sThread2=new SimpleThread();
		sThread2.start();
		sThread2.setName("Second");
	}
}