package com.demo.exceptiondemo;

class LowBalance extends Exception
{
	public LowBalance(String msg)
	{
		super(msg);
	}
}

class Account      //User defined exception class
{
	private int accountNo;
	private String accountHolder;
	private double balance;
	
	public Account()
	{
		accountNo=123456; accountHolder="ABC"; balance=8978.23;
	}

	@Override
	public String toString()
	{
		return "Account Details:\nAccount Number="+accountNo+"\nAccount Holder="+accountHolder+"\nBalance="+balance+"\n";
	}
	
	public void withDraw(double amt) throws LowBalance
	{
		System.out.println("Withdraw called");
		if(balance-amt<3000)
			throw new LowBalance("Balance is low");
			balance=balance-amt;	
	}
}

public class Demo8
{
	public static void main(String[] args) //Main is the caller method //Caller of main is JVM
	{
		Account account=new Account();
		System.out.println(account);
		try
		{
			account.withDraw(12000);
		} 
		catch (LowBalance e) 
		{
			e.printStackTrace();
		}
		System.out.println(account);
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