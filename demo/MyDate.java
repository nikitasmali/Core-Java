package demo;

public class MyDate 
{
	private int day,month,year;
	
	public void initDate() 
	{
		day = 14;
		month = 07;
		year = 2023;
	}
	
	public void showDate()
	{
		System.out.println("Todays Date is "+day+"/"+month+"/"+year);
	}
	
	public void setDay(int d)
	{
		day=d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth(int m)
	{
		month=m;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear(int y)
	{
		year=y;
	}
	
	public int getYear()
	{
		return year;
	}
}
