package inheritance;

public class Developer extends Employee
{
	private int numberOfProjects;
	private double rateOfInc;
	
	public Developer()
	{
		numberOfProjects=7;
		rateOfInc=1000;
	}
	public Developer(int numberOfProjects, double rateOfInc)
	{
		this.numberOfProjects=numberOfProjects;
		this.rateOfInc=rateOfInc;
	}
	
	public Developer(int empId,String name,double basicSalary,int numberOfProjects, double rateOfInc)
	{
		super(empId, name, basicSalary);
		this.numberOfProjects=numberOfProjects;
		this.rateOfInc=rateOfInc;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	public double calculateIncentive()
	{
		if(rateOfInc*numberOfProjects < basicSalary/2)
		{
		   return rateOfInc*numberOfProjects;
		}
		else
			return basicSalary/2;
	    }
	
	public double calculateSalary()
	{
		return super.calculateSalary()+calculateIncentive();
	}

}
