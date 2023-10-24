package com.demo.filedemo;

public class Address
{
	private String city;
	private String pincode;
	
	public Address() 
	{
		this("PUNE","411052");
	}
	
	public Address(String city, String pincode) 
	{
		this.city=city;
		this.pincode=pincode;
	}
	
	public void setCity(String city)
	{
		city = city;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setPincode(String pincode) 
	{
		this.pincode = pincode;
	}
	
	public String getPincode()
	{
		return pincode;
	}

	@Override
	public String toString() 
	{
		
		return "Address:\nCity="+city+"\nPincode="+pincode+"\n";
	}
	
}
