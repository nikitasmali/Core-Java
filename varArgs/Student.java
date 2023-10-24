package varArgs;

public class Student
{
	public void display(String name,int...marks)
	{
				int total = 0;
				for(int i:marks)
				total+=i;
				float avg = (float)total/marks.length;
				System.out.println("name"+name+"\nAverage="+avg+"\n");
	}
	
	public static void main(String[] args) 
	{
		Student student=new Student();
		student.display("Nikita", 20,20,20);
		student.display("ABC", 98,97,96,95);
	}
}
