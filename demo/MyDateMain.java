
package demo;
public class MyDateMain 
{

	public static void main(String[] args)
	{
		MyDate md=new MyDate();
		md.initDate();
		md.showDate();
		
		md.setDay(13);
		md.setMonth(5);
		md.setYear(2002);
		System.out.println("Date="+md.getDay()+"/"+md.getMonth()+"/"+md.getYear());
	}
}
