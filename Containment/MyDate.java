package containment;

public class MyDate
{
	private int day,month,year;
	
	public MyDate()
	{
		//constructor chaining
		this(24,5,2000);
	}

	public MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() 
	{
		
		return "Date:"+day+"/"+month+"/"+year;
	}
	public void showDate()
	{
		System.out.println("Date is "+day+ "/"+month+"/"+year);
	}
}
