package abstractdemo;

public class MobilePhoneMain
{
	public static void main(String[] args)
	{
		MobilePhone simplePhone=new SimplePhone();
		simplePhone.makeCall();
		
		MobilePhone smartPhone=new SmartPhone();
		smartPhone.makeCall();
	}
}
