package com.demo.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment
{
	public static void main(String[] args)
	{
		File file=new File("d:\\FileDir1\\abc.txt");
		if(file.exists())
		{
			FileInputStream fis=null;
			try 
			{
				fis=new FileInputStream(file);
				int data=0;
				while((data=fis.read())!=-1)
						{
							System.out.println((char)data);
						}
			} 
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(file!=null)
						fis.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		else
		{
			System.out.println("File Not exists");
		}
		
		FileOutputStream fos=null;
		try 
		{
			fos=new FileOutputStream("d:\\FileDir1\\xyz.txt",true);
			String str="Writing File";
			for(int i=0;i<str.length();i++)
				fos.write(str.charAt(i));
			System.out.println("Done Checking");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}