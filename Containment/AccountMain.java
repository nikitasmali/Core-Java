/* class MyDate is already created .
 * Write a class Account in which use object of MyDate class as contained object
 *to represent account creation date with default and parameterized constructor*/


package containment;

public class AccountMain
{

	public static void main(String[] args)
	{
		Account account=new Account();
		System.out.println(account);
		
		Account account1=new Account(123457,"PQR",884786.32,new MyDate(19,1,1998));
		System.out.println(account1);

	}

}
