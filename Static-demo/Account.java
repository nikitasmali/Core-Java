package staticdemo;

public class Account
{
	private int accNo;
	private String ownerName;
	private double balance;
	static double interestrate;
	
	static 
	{
		interestrate=2.5;
	}
	
	public static void getInterestRate()
	{
		System.out.println("Interest Rate="+interestrate);
	}
	public Account()
	{
		this(111,"Nikita",12345);
	}
	
	public Account(int accNo,String ownerName,double balance)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public void showAccount()
	{
		System.out.println("Account Deatils:\nAccount no.="+accNo+"\nOwnerName="+ownerName+"\nBalance="+balance+"\n");
	}
	
	
}
