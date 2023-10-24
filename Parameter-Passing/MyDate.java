package parameterpassing;

public class MyDate
{
 private int day,month,year;
	
	public MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	@Override
	public String toString()
	{
		
		return "Date = "+day+"/"+month+"/"+year;
	}
	
	public static void swap(MyDate mydate,MyDate mydate1)
	{
		MyDate temp = mydate;
		mydate = mydate1;
		mydate1 = temp;
	}
	
	
	public static void main(String[] args) 
	{
		MyDate mydate=new MyDate(13,5,2002);
		MyDate mydate1=new MyDate(14,6,2002);
		
		System.out.println("Before swapping :"+mydate+"\n"+mydate1);
		swap(mydate,mydate1);
		System.out.println("\nAfter swapping:"+mydate+"\n"+mydate1);
		
	 //dosen't swap
	}
}
