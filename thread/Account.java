package com.demo.threaddemo;

public class Account
{
	private int accNo;
	private double balance;
	
	public Account()
	{
		accNo = 111;
		balance = 100000;
	}
	
	public void showAccount()
	{
		System.out.println("Account Number="+accNo+"\nBalance="+balance+"\n");
	}
	
	public void setAccno(int accNo)
	{
		this.accNo = accNo;
	}
	
	public int getAccno()
	{
		return accNo;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
}