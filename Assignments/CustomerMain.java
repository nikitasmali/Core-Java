package assignment;

public class CustomerMain
{

	public static void main(String[] args) 
	{
		Customer customer=new Customer();
		customer.initDetails();
		customer.showDetails();
		customer.setname("Pooja");
		customer.setemail("pooja@mail.com");
		customer.setage(18);
		customer.setphone(123498745);
		customer.showDetails();

	}

}
