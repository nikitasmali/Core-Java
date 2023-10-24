package finalVariable;

public class MyDate implements Printable
{
	private int day,month,year;
	
	public MyDate()
	{
		//constructor chaining
		this(24,5,2023);
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
	
	@Override
		public boolean equals(Object obj) 
	    {
			MyDate dref=((MyDate)obj);
			if(this.day==dref.day && this.month==dref.month && this.year==dref.year)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	@Override
	public void printData()
	{
		System.out.println("Date:"+day+"/"+month+"/"+year);
		
	}
	
}
