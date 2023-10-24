package staticassignment;

public class EmployeeMain 
{

	public static void main(String[] args)
	{
		Employee.getCount();
		Employee employee=new Employee();
		Employee employee1=new Employee("Akshata", 400000.0f);
		Employee employee2=new Employee("Vaishnavi", 6000000.7f);
		System.out.println(employee+"\n"+employee1+"\n"+employee2+"\n");
		Employee.getCount();
	}
	

}
