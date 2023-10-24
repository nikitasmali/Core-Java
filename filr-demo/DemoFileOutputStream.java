package com.demo.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutputStream 
{
	public static void main(String[] args)
	{
		FileOutputStream fos=null;
		try 
		{
			fos=new FileOutputStream("d:\\FileDir1\\lmn.txt",true);
			String str="This is file writing program in java";
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
