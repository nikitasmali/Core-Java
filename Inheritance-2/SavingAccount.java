package inheritance2;

public class SavingAccount extends Account
{
	private double balance;
	
	public SavingAccount()
	{
		balance = 7668.34;
	}
	
	public SavingAccount(int accNo, String name, double balance)
	{
		super(accNo,name);
		this.balance=balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance() 
	{
		return balance;
	}

	
	@Override
	public String toString()
	{
		return super.toString()+"Balance="+balance+"\n";
	}
	
	public double AccountDetails()
	{
		return super.accNo+balance;
	}
}
