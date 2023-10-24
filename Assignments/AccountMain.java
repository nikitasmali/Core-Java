package assignment;

public class AccountMain
{

	public static void main(String[] args)
	{
		Account account=new Account();
		account.initDetails();
		account.showDetails();
		
		account.setaccNo(789123);
		account.setownerName("Akshata");
		account.setbalance(9875.4);
		System.out.println("Updated Account Details are:\nAccount number="+account.getaccNo()+"\nOwner Name="+account.getownerName()+"\nBalance="+account.getbalance());
	
		System.out.println("\nName="+account.getownerName());
	}
	

}
