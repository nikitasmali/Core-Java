package inheritance2;

public class BankMain
{
	public static void main(String[] args)
	{
		Account account=new Account();
		System.out.println(account);
		
		SavingAccount savingAccount=new SavingAccount(243563, "XYZ", 20984.6);
		System.out.println(savingAccount);
		
		FixedDepositeAccount fixedDepositeAccount=new FixedDepositeAccount(736487, "LMN", 200000, 2.5f);
		System.out.println(fixedDepositeAccount);
	}
}
