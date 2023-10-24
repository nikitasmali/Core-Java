package inheritance2;

public class FixedDepositeAccount extends Account
{
	private double amount;
	private float duration;
	
	public FixedDepositeAccount()
	{
		amount = 500000;
		duration = 1.5f;
	}
	
	public FixedDepositeAccount(int accNo, String name, double amount, float duration)
	{
		super(accNo,name);
		this.amount=amount;
		this.duration=duration;
	}
	 
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setDuration(float duration)
	{
		this.duration = duration;
	}
	public float getDuration()
	{
		return duration;
	}
	
	@Override
	public String toString() 
	{
		return super.toString()+"Amount="+amount+"\nDuration="+duration+"\n";
	}
	
	public double AccountDetails()
	{
		return super.accNo+amount;
	}
}
