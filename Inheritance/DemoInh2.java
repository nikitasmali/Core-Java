package inheritance;

import inheritance2.SalesManager;

public class DemoInh2 
{
	public static void main(String[] args)
	{
		Employee earray[]=new Employee[5];
		earray[0]=new Employee(11, "ABC", 20000);
		earray[1]=new Developer(12, "PQR", 10000, 2, 1000);
		earray[2]=new Developer(13, "MNO", 10000, 3, 1000);
		earray[3]=new SalesManager(14, "MNR", 20000, 10, 4000);
		earray[4]=new Manager(15, "MNW", 45000, 5, 2000, 4500);
		
		for(Employee e1:earray)
		{
			showData(e1);
		}
	}
	
	public static void showData(Employee e)
	{
		System.out.println(e+"Net Pay="+e.calculateSalary());
		
		//Down Cast
		if(e instanceof Developer)
		{
			System.out.println("Incentive="+((Developer)e).calculateIncentive());
		}
		else if(e instanceof Manager)
		{
			System.out.println("Additional Salary="+((Manager)e).calculateIncentive());
		}
		else if(e instanceof SalesManager)
		{
			System.out.println("Commission="+((SalesManager)e).calculateCommission());
		}
	}
}
