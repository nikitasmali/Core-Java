package inheritance;

import inheritance2.SalesManager;

public class EmployeeMain 
{
	public static void main(String[] args)
	{
		/* Employee employee=new Employee();
		System.out.println(employee);
		*/
		Developer developer=new Developer();
		Developer developer2=new Developer(4, "PQR", 83658.4, 2, 5000);
		System.out.println(developer2+"Incentive="+developer.calculateIncentive()+"\nNet salary="+developer.calculateSalary());
		
		Manager manager=new Manager(5, "MNO", 779.54, 2, 2000, 500);
		System.out.println(manager);
		
		SalesManager salesManager=new SalesManager(10, "MNO", 20000, 10, 10000);
		System.out.println(salesManager+"Commission="+salesManager.calculateCommission()+"\nSalary="+salesManager.calculateSalary());
	}
}
