package demoString;

public class DemoStringBuffer
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("PUNE");
		StringBuffer sb2 = new StringBuffer("PUNE");
		System.out.println(sb1+" "+sb2);
		
		if(sb1==sb2)
			  System.out.println("Both same");  
		   else
			   System.out.println("Not same");
		
		//Its showing not same because equals method is not available in StringBuffer 
		if(sb1.equals(sb2))
			  System.out.println("Both same");  
		   else
			   System.out.println("Not same");
		
		System.out.println(sb1);
	}

}
