package com.demo.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rollNo;
	String name;
	
	public Student()
	{
		rollNo=11;
		name="ABC";
	}
	
	@Override
	public String toString()
	{
		return "Student- "+rollNo+" "+name;
	}
}
public class DemoSerialization 
{
	public static void main(String[] args)
	{
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fos=new FileOutputStream("StudData.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);  //Serialization
			Student s1=new Student();
			oos.writeObject(s1);
			System.out.println("Done Checking");
			
			fis=new FileInputStream("StudData.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);	//DeSerialization
			System.out.println(ois.readObject());
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
 