package inheritanceassignment;

public class Item
{
	private String title;
	private String publisher;
	private int yearPublished;
	protected double ISBN;
	private double price;
	
	public Item()
	{
		this("History","ABC", 2023, 1234567891, 850.5);
	}
	
	public Item(String title, String publisher, int yearPublished, double ISBN, double price)
	{
		this.title=title;
		this.publisher=publisher;
		this.yearPublished=yearPublished;
		this.ISBN=ISBN;
		this.price=price;
	}
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	public int getYearPublished() 
	{
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) 
	{
		this.yearPublished = yearPublished;
	}

	public double getISBN()
	{
		return ISBN;
	}

	public void setISBN(double iSBN) 
	{
		ISBN = iSBN;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Item Deatils:\nTitle="+title+"\nPublisher="+publisher+"\nYear Published="+yearPublished+"\nISBN="+ISBN+"\nPrice="+price+"\n";
	}
	
}
