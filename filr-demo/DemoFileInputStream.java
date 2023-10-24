package com.demo.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileInputStream
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
	}
}
