package assignment;

public class Customer
{
	private String name;
	private String email;
	private int age;
	private int phone;
	
	public void initDetails()
	{
		name = "Nikita";
		email = "nikita@gmail.com";
		age = 18;
		phone = 1234567891;
		
	}
	
	public void showDetails()
	{
		System.out.println("Deatils:\nName="+name+"\nAge="+age+"\nEmail="+email+"\nphone="+phone+"\n");
	}
	
	public void setname(String abc)
	{
		name = abc;
	}
	public String getname()
	{
		return name;
	}
	
	public void setemail(String abc)
	{
		email = abc;
	}
	public String getemail()
	{
		return email;
	}
	
	public void setage(int a)
	{
		age = a;
	}
	public int getage()
	{
		return age;
	}
	
	public void setphone(int p)
	{
		phone = p;
	}
	public int getphone()
	{
		return phone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
