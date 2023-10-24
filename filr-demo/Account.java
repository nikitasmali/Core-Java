package com.demo.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable
{
	private int accountNumber;
	private String accountHolderName;
    private double balance;
    
    public Account()
    {
		accountNumber=11;
		accountHolderName="ABC";
		balance=19000;
	}
    public void printDetails()
    {
    	System.out.println("Details:AccNumber="+accountNumber+"\nName="+accountHolderName+"\nBalance"+balance);
    }
	public static void main(String[] args)
	{
			FileOutputStream fos=null;
			FileInputStream fis=null;
			try
			{
				fos=new FileOutputStream("account.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fos);  //Serialization
				Account a1=new Account();
				oos.writeObject(a1);
				System.out.println("Done Checking");
				
				fis=new FileInputStream("account.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);	//DeSerialization
				Account a2=(Account)ois.readObject();
				a2.printDetails();
				System.out.println("Done All");
			}
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(fos!=null)
						fos.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
}
