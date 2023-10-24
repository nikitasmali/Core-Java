package inheritanceassignment;

public class Book extends Item
{
	private String author;
	private String edition;
	private String volume;
	
	public Book()
	{
		author = "MNO";
		edition = "1st edition";
		volume = "Volume 1";
	}
	
	public Book(String author, String edition, String volume, String title, String publisher, int yearPublished, double ISBN, double price)
	{
		super(title, publisher, yearPublished, ISBN, price);
		this.author=author;
		this.edition=edition;
		this.volume=volume;
	}
	
	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getEdition() 
	{
		return edition;
	}

	public void setEdition(String edition)
	{
		this.edition = edition;
	}

	public String getVolume() 
	{
		return volume;
	}

	public void setVolume(String volume) 
	{
		this.volume = volume;
	}

	
	@Override
	public String toString()
	{
		return super.toString()+"Author="+author+"\nEdition="+edition+"\nVolume="+volume+"\n";
	}
}
