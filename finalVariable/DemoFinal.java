package finalVariable;

import inheritance.Employee;

class Parent
{
	public void show()
	{
	System.out.println("Inside parent show method");
	}
}

final class Child extends Parent
{
	public void show()
	{
	System.out.println("Inside child show method ");
	}
}

class GrandChild extends Parent
{
	public void show()
	{
	System.out.println("Inside grand child show method ");
	}
}
public class DemoFinal 
{
	public static void main(String[] args)
	{
		//final variable
		final int i;
		i=123;
		System.out.println(i);
		
		//final object = object can be change but reference can be same
		final Employee employee=new Employee();
		System.out.println(employee);
		employee.setEmpId(4);
		System.out.println(employee);
		
		Parent parent=new Parent();
		parent.show();
		
		Child child=new Child();
		child.show();
		
		GrandChild grandChild=new GrandChild();
		grandChild.show();
	}
}
