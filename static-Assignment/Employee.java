/*Write a class Employee with int empId, String name, float salary as attributes. 
 * Create 3 objects of Employee and print details */

package staticassignment;

public class Employee
{
	private int empId;
	private String name;
	private float salary;
	static int empno,count;
	
	static
	{
		empno = 7;
		count = 0;
	}
	
	public Employee()
	{
		this("Nikita", 5000000);
	}
	
	public Employee(String name, float salary)
	{
		this.empId = empno++;
		this.name = name;
		this.salary = salary;
		count++;
	}
	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Employee Details Are:\nEmployee Id=" +empId+ " "+name+" "+salary;
	}
	
	public void showEmployee()
	{
		System.out.println("Employee Details Are:\nEmployee Id="+empId+"\nName="+name+"\nSalary="+salary+"\n");
	}
	
	public static void getCount()
	{
		System.out.println("Total Count="+count+"\n");
	}
	
}
