package containment;

public class Employee 
{
	private int empId;
	private String name;
	private float salary;
	private MyDate joiningDate;
	
	public Employee()
	{
			this(3,"Nik",2345.5f,new MyDate());
		
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empId,String name,float salary,MyDate joiningDate)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
		this.joiningDate=joiningDate;
	}
	
	@Override
	public String toString()
	{
		return  "Employee details:"+empId+" "+name+" "+salary+" "+joiningDate;
	}
}
