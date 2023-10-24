package staticassignment;

public class CustomerMain
{
	public static void main(String[] args)
	{
		Customer.getCount();
		Customer customer=new Customer();
		Customer customer1=new Customer("ABC", 237948975, 300.4);
		customer1.setCustomerName("Nikita");
		Customer customer2=new Customer("PQR", 578479487, 800.56);
		customer2.setTotalBill(5000.23);
		System.out.println("\n"+customer+"\n"+customer1+"\n"+customer2+"\n");
		Customer.getCount();
	}
}
