package containment;

public class ProductMain
{

	public static void main(String[] args)
	{
		Product product=new Product();
		System.out.println(product);
		
		Product product1=new Product("Mobile", 75000.45, new MyDate(30, 6, 2000));
		System.out.println(product1);
		
	}

}
