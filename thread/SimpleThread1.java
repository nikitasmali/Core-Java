package com.demo.threaddemo;

//Second way of creating thread by implementing Runnable
public class SimpleThread1 implements Runnable
{
	public static void main(String[] args)
	{
		SimpleThread1 sThread1=new SimpleThread1();
		Thread t1=new Thread(sThread1);
		Thread t2=new Thread(sThread1);
		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();
	}

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Hi Thread...." +i+ " " +Thread.currentThread().getName());
	}
}