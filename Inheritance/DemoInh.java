package inheritance;

public class DemoInh
{
	public static void main(String[] args)
	{
		Developer developer=new Developer(12, "PQR", 20000, 3, 2000);
		System.out.println(developer+"Net Pay="+developer.calculateSalary()+"\n");
		System.out.println(developer+"Incentive="+developer.calculateIncentive()+"\n");
		
		//object created using the reference of parent/super class
		Employee developer2=new Developer(13, "LMN", 30000, 4, 1000);
		System.out.println(developer2+"Net Pay="+developer2.calculateSalary()+"\n");
		
		//TypeCasting
		Developer developer3; // creating only reference
		developer3=(Developer)developer2;
		System.out.println(developer2+"Incentive="+developer3.calculateIncentive()+"\n");
	}
}
