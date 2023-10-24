package polyamorphismORoverriding;

public class EmployeeMain 
{
	public static void main(String[] args)
	{
		Employee employee=new Employee();
		System.out.println(employee);
		
		WageEmployee wageEmployee=new WageEmployee(1, "MNO", 18, 250.5f);
		System.out.println(wageEmployee+"Total Salary="+wageEmployee.calculateSalary()+"\n");
		
		WageEmployee wageEmployee2=new WageEmployee(2, "PQR", 12, 150);
		System.out.println(wageEmployee2+"Total Salary="+wageEmployee2.calculateSalary()+"\n");
	}
}
