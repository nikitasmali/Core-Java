package overloading;

public class Account
{
	private int accNo;
	private String accountHolder;
	private double balance;
	static double interestRate;
	
	static
	{
		interestRate=2.5;
	}
	
	public Account()
	{
		this(111, "Nikita", 12345);
	}
	
	public Account(int accNo,String accountHolder,double balance)
	{
		this.accNo=accNo;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public void showAccount()
	{
		System.out.println("Account Details:\nAccount No.="+this.accNo+"\nAccount Holder="+this.accountHolder+"\nBalance="+this.balance);
		
	}
	
	public static void getInterestRate()
	{
		System.out.println("Interest rate is="+interestRate+"\n");
	}
}
