package assignment;

public class Student
{
	private int rollNo;
	private String name;
	private float percentage;
	
	public void initStudent()
	{
		rollNo = 07;
		name = "Nikita";
		percentage = 97.4f;
	}
	
	public void printDetails()
	{
		System.out.println("Student Details Are:\n1.Roll No="+rollNo+"\n2.Name="+name+"\n3.Percentage="+percentage);
	}
}
