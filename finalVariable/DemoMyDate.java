package finalVariable;

public class DemoMyDate
{
	public static void main(String[] args)
	{
		MyDate mydate=new MyDate();
		MyDate mydate1=new MyDate();
		System.out.println(mydate+"\n"+mydate1);
		
		//this will check for reference/address ..thats why it is showing different 
		if(mydate==mydate1)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}
		
		//using equals method but also needs to be override equal metod in MyDate 
		if(mydate.equals(mydate1))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}
	}
}
