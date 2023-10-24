package demo;

public class ArithmeticOperations 
{
	private int num1,num2,sum,sub,mul,div;
	
	public void initValues()
	{
		num1 = 750;
		num2 = 5;
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
	} 
	
	public void showResult()
	{
		System.out.println("Addition="+sum+"\nSubstraction="+sub+"\nMultiplication="+mul+"\nDivision="+div);
	}
}
