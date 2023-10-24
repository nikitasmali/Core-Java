package assignment;

public class Account
{
	private int accNo;
	private String ownerName;
	private double balance;
	
	public void initDetails()
	{
		accNo = 123456;
		ownerName = "Nikita";
		balance = 98000.7;
	}
	
	public void showDetails()
	{
		System.out.println("Account Details are:\nAccount Number="+accNo+"\nOwner Name="+ownerName+"\nBalance="+balance);
	}
	
	public void setaccNo(int a)
	{
		accNo = a;
	}
	public int getaccNo()
	{
		return accNo;
	}
	
	public void setownerName(String abc)
	{
		ownerName = abc;
	}
	public String getownerName()
	{
		return ownerName;
	}
	
	public void setbalance(double b)
	{
		balance = b;
	}
	public double getbalance()
	{
		return balance;
	}
}
