package com.demo.filedemo;

import java.io.File;
import java.io.IOException;

public class DemoFile 
{
	public static void main(String[] args)
	{
		File file=new File("d:\\FileDir1\\abc.txt");
		if(file.exists())
		{
			System.out.println("File Exists");
		}
		else
		{
			try 
			{
				file.createNewFile();
				System.out.println("File Created");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		/*if(file.isDirectory())
		{
		String []filelist = file.list();
		for(String str:filelist)
			System.out.println(str);
		}
		else
		{
			file.mkdir();
			System.out.println("Directory Created Successfully..");
		}*/
	}
}