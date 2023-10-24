package collection;

import java.util.Hashtable;

public class DemoHashTable 
{
	public static void main(String[] args)
	{
		Hashtable ht=new Hashtable<>();
		ht.put(12, "sdfcd");
		ht.put(45, "ddfgt");
		ht.put(56, "fght");
		ht.put(12, "dvd");
		ht.put(57, "dvd");
		ht.put(46, 345);
		ht.put("sdfcd",345);
		System.out.println(ht);
	}
}