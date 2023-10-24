package inheritance;

public class Employee
{
	private int empId;
	private String name;
	private double hra, da, pt, pf;
	protected double basicSalary;
	
	public Employee()
	{
		this(3,"ABC",50000.5);
	}
	
	public Employee(int empId,String name,double basicSalary)
	{
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
		this.hra=basicSalary/2;
		this.da=basicSalary*0.13;
		this.pt=200;
		this.pf=basicSalary*0.12;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return basicSalary;
	}
	public void setSalary(double salary) 
	{
		this.basicSalary = basicSalary;
	}
	
	@Override
	public String toString()
	{
		return  "Employee details:\nEmployee Id="+empId+"\nEmployee Name="+name+"\nSalary="+calculateSalary()+"\n";
	}
	
	public double calculateSalary()
	{
		return basicSalary+hra+da-pt-pf;
	}
}
