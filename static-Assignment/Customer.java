/*  Write a class Customer and count no. of customer objects 
 * and print no. of customers before and after creating 3 objects of customers*/


package staticassignment;

public class Customer 
{
	private int customerId;
	private String customerName;
	private int mobileNo;
	private double totalBill;
	static int count, customerNo;
	
	static
	{
		count = 0;
		customerNo = 0;
	}
	
	public Customer()
	{
		this("XYZ", 123456789, 2000.34);
	}
	
	public Customer(String customerName, int mobileNo, double totalBill)
	{
		this.customerId = customerNo++;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.totalBill = totalBill;
		count++;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public int getMobileNo()
	{
		return mobileNo;
	}

	public void setMobileNo(int mobileNo)
	{
		this.mobileNo = mobileNo;
	}

	public double getTotalBill()
	{
		return totalBill;
	}

	public void setTotalBill(double totalBill)
	{
		this.totalBill = totalBill;
	}
	
	@Override
	public String toString()
	{
		
		return customerName+" "+mobileNo+" "+totalBill;
	}
	public void showCustomerDetails()
	{
		System.out.println("Details Of Customers:\nCustomer Name="+customerName+"\nMobile No="+mobileNo+"\nTotal Bill="+totalBill+"\n");
	}
	
	public static void getCount()
	{
		System.out.println("Total count of customer="+count);
	}
}
