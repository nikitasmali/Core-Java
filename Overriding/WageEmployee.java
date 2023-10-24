package polyamorphismORoverriding;

public class WageEmployee extends Employee
{
	private int hours;
	private float rate;
	
	public WageEmployee()
	{
		hours = 1;
		rate = 450.5f;
	}
	
	public WageEmployee(int empId,String name,int hours, float rate)
	{
		super(empId, name);
		this.hours=hours;
		this.rate=rate;
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	public int getHours()
	{
		return hours;
	}
	
	public void setRate(float rate)
	{
		this.rate = rate;
	}
	public float getRate()
	{
		return rate;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"Hours="+hours+"\nRate="+rate+"\nTotal Salary="+calculateSalary()+"\n";
	}
	
	public double calculateSalary()
	{
		return hours * rate;
	}
}
