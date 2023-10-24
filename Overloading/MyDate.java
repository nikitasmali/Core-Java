package overloading;

public class MyDate
{

	private int day,month ,year;
	
	public MyDate()
	{
		this(17,7,2023);
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	public int getDay()
	{
	  return day;
	}
	
	
	public void setMonth(int m)
	{
		day = m;
	}
	
	public int getMonth()
	{
	  return month;
	}
	
	
	public void setYear(int y)
	{
		day = y;
	}
	public int getYear()
	{
	  return year;
	}
	

	public MyDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	public MyDate(int d,int m)
	{
		day = d;
		month = m;
		year = 2024;
	}
	
	public MyDate(int y)
	{
		this(21,5);
		year = y;
	}
	public void showDate()
	{
		System.out.println("Date="+day+"/"+month+"/"+year);
	}
}
