package com.demo.threaddemo;

public class AccountMain extends Thread
{
	Account a;
	public AccountMain(Account a)
	{
		this.a=a;
	}
		
	public void withDraw(double amount)
	{
		synchronized (a)
		{
			double balance = a.getBalance();
			System.out.println("Before withdraw balance = "+balance);
			balance = balance - amount;
			a.setBalance(balance);
			System.out.println("After withdraw balance = "+balance);
		}
	}
	
	public void deposit(double amount)
	{
		synchronized (a)
		{
			double balance = a.getBalance();
			System.out.println("Before deposit balance = "+balance);
			balance = balance - amount;
			a.setBalance(balance);
			System.out.println("After deposit balance = "+balance);
		}
	}

	public static void main(String[] args) 
	{
		Account account=new Account();
		AccountMain t1=new AccountMain(account);
		t1.setName("t1");
		AccountMain t2=new AccountMain(account);
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run()
	{
		if(Thread.currentThread().getName().equals("t1"));
			withDraw(2000);
		if(Thread.currentThread().getName().equals("t2"));
			deposit(1000);
	}
}
