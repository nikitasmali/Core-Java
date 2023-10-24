package assignments;

public class TestCalculator 
{
	public static void main(String[] args)
	{
		Calculator calculator=new Calculator();
		System.out.println("For int addition="+calculator.add(4, 5));
		System.out.println("For double addition="+calculator.add(4.5, 6.5));
		System.out.println("For int and float addition="+calculator.add(2, 2.5));
	}
}
