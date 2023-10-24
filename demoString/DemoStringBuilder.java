package demoString;

public class DemoStringBuilder 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Nashik");
		StringBuilder sb1 = new StringBuilder("Nashik");
		System.out.println(sb+" "+sb1);
		
		if(sb==sb1)
			  System.out.println("Both same");  
		   else
			   System.out.println("Not same");
		
		//Its showing not same because equals method is not available in StringBuilder 
		if(sb.equals(sb1))
			  System.out.println("Both same");  
		   else
			   System.out.println("Not same");
		
		System.out.println(sb);
	}
}
