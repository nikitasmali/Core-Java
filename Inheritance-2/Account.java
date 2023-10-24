package inheritance2;

public class Account
{
	protected int accNo;
	protected String name;
	
	public Account()
	{
		this(123456, "ABC");
	}
	
	public Account(int accNo, String name)
	{
		this.accNo=accNo;
		this.name=name;
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public int getAccNo()
	{
		return accNo;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}

	@Override
	public String toString()
	{
		return "Account details:\nAccount number="+accNo+"\nName="+name+"\n";
	}
	
	public double AccountDetails()
	{
		return accNo;
	}
}
