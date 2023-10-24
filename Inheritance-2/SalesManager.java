package inheritance2;

import inheritance.Employee;

public class SalesManager extends Employee
{
	private double rateOfCommission, salesAmount;
	
	public SalesManager()
	{
		salesAmount=10000;
		rateOfCommission=10;
	}
	
	public SalesManager(int empId,String name,double basicSalary, double rateOfCommission, double salesAmount)
	{
		super(empId,name,basicSalary);
		this.rateOfCommission=rateOfCommission;
		this.salesAmount=salesAmount;
	}
	
	public double calculateCommission()
	{
		if(basicSalary/2 > salesAmount * rateOfCommission/100)
		{
			return salesAmount * rateOfCommission/100;
		}
		else
		{
			return basicSalary/2;
		}
	}
	
	public double calculateSalary()
	{
		return super.calculateSalary()+calculateCommission();
	}
}
