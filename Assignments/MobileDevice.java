package assignment;

public class MobileDevice
{
	private String model;
	private String brand;
	private String storage;
	private double price;
	
	public void initDetails()
	{
		model = "iphone 12";
		brand = "Apple";
		storage = "256GB";
		price = 990000;
	}
	
	public void showDetails()
	{
		System.out.println("Details:\nBrand="+brand+"\nModel="+model+"\nStorage="+storage+"\nPrice="+price+"\n");
	}
	
	public void setmodel(String abc)
	{
		model = abc;
	}
	public String getmodel()
	{
		return model;
	}
	public void setbrand(String abc)
	{
		brand = abc;
	}
	public String getbrand()
	{
		return brand;
	}
	public void setstorage(String mno)
	{
		storage = mno;
	}
	public String getstorage()
	{
		return storage;
	}
	
	public void setprice(double p)
	{
		price = p;
	}
	public double getprice()
	{
		return price;
	}
}
