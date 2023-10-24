package inheritanceassignment;

public class Software extends Item
{
	private double version;
	
	public Software()
	{
		version = 1.0;
	}
	
	public Software(double version, String title, String publisher, int yearPublished, double ISBN, double price)
	{
		super(title, publisher, yearPublished, ISBN, price);
		this.version = version;
	}
	

	public double getVersion()
	{
		return version;
	}

	public void setVersion(double version)
	{
		this.version = version;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"Version="+version+"\n";
	}
}
