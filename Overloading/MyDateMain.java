package overloading;

public class MyDateMain 
{

	public static void main(String[] args) 
	{
		MyDate mydate=new MyDate();
		mydate.showDate();
		
		
		MyDate mydate1=new MyDate(20,6);
		mydate1.showDate();
		
		MyDate mydate2=new MyDate(20,6,2023);
		mydate2.showDate();
		
		MyDate mydate3=new MyDate(2025);
		mydate3.showDate();
	}

}
