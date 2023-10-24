package containment;

public class EmployeeMain
{

	public static void main(String[] args)
	{
		Employee employee=new Employee();
		System.out.println(employee+"\n");
		
		Employee employee1=new Employee(2, "PQR", 8947856,new MyDate(13,5,2002));
		System.out.println(employee1);
		

	}
}
