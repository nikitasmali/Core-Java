package containment;

public class Account
{
	private int accountNumber;
	private String accountHolder;
	private double balance;
	private MyDate creationDate;
	
	public Account()
	{
		this(123456, "ABC", 987456.34, new MyDate());
	}
	
	public Account(int accountNumber, String accountHolder, double balance, MyDate creationDate)
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
		this.creationDate=creationDate;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString()
	{
		return "Account Details:\nAccount Number="+accountNumber+"\nAccount Holder Name="+accountHolder+"\nBalance="+balance+"\nAccount Creation Date"+creationDate+"\n";
	}
}
