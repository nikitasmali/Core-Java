package collection;

import java.util.TreeMap;

public class DemoTreeMap 
{
	public static void main(String[] args)
	{
		TreeMap tm=new TreeMap<>();
		tm.put(12, "Pune");
		tm.put(45, "Mumbai");
		tm.put(56, "Goa");
		tm.put(12, "Delhi");
		tm.put(57, "Nashik");
		System.out.println(tm);
	}
}