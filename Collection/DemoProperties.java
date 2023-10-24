package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties 
{
	public static void main(String[] args)
	{
		try
		{
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("DBConfig.properties");
		p.load(fi);
		String s1=p.getProperty("user");
		System.out.println(s1);
		String s2=p.getProperty("password");
		System.out.println(s2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
