package inheritance;

public class Manager extends Employee
{
	private double incentive;
	
	public Manager()
	{
		incentive = 5000.50;
	}
	
	public Manager(int empId,String name,double basicSalary,int numberOfProjects, double rateOfInc, double incentive)
	{
		super(empId, name, basicSalary);
		this.incentive=incentive;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	public double calculateIncentive()
	{
		if(incentive < basicSalary/2)
		{
		return incentive;
		}
		else
		{
			return basicSalary/2;
		}
	}
}

