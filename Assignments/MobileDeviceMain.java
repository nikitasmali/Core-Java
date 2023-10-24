package assignment;

public class MobileDeviceMain
{

	public static void main(String[] args) 
	{
		MobileDevice mobiledevice=new MobileDevice();
		mobiledevice.initDetails();
		mobiledevice.showDetails();
		mobiledevice.setmodel("Galaxy s23");
		mobiledevice.setbrand("Samsung");
		mobiledevice.setstorage("128GB");
		mobiledevice.setprice(876543.3);
		mobiledevice.showDetails();

	}

}
