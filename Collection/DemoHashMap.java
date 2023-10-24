package collection;

import java.util.HashMap;
import java.util.Iterator;

public class DemoHashMap
{
	public static void main(String[] args)
	{
		HashMap hm=new HashMap<>();
		hm.put(12, "sdfcd");
		hm.put(45, "ddfgt");
		hm.put(56, "fght");
		hm.put(12, "dvd");
		hm.put(null, "sdfs");
		hm.put(57, "dvd");
		hm.put(87, "null");
		hm.put(46, 345);
		hm.put("sdfcd",345);
		System.out.println(hm);
		
		HashMap mp = new HashMap<>();
		mp.put(21, "Twenty one");
		mp.put(31, "Thirty one");
		Iterator<Integer> it = mp.keySet().iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println("Key="+key+" And Value="+mp.get(key));
		}
	}
}
