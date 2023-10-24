package overloading;

public class AccountMain
{

	public static void main(String[] args)
	{
		Account account=new Account();
		account.showAccount();
		Account.getInterestRate();
		
		Account account1=new Account(112,"Akshata",243648.7);
		account1.showAccount();
		Account.getInterestRate();
	}
}
