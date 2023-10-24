package overloading;

public class MultiplyMain
{

	public static void main(String[] args)
	{
		Multiply multiply=new Multiply();
		multiply.multiply(6, 5);
		multiply.multiply(4.5f, 5);
		multiply.multiply(4.5, 5, 4);
		multiply.multiply(6, 5, 3);

	}

}
