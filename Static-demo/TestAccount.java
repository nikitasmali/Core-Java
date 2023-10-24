package staticdemo;

public class TestAccount
{

	public static void main(String[] args)
	{
		Account account=new Account();
		account.showAccount();
		
		Account account1=new Account(112,"ABC",57789.3);
		account1.showAccount();
		Account.getInterestRate();

	}

}
