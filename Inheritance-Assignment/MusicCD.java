package inheritanceassignment;

public class MusicCD extends Item
{
	private String artist;
	private String volume;
	
	public MusicCD()
	{
		artist = "MNO";
		volume = "Volume 2";
	}
	
	public MusicCD(String artist, String volume, String title, String publisher, int yearPublished, double ISBN, double price)
	{
		super(title, publisher, yearPublished, ISBN, price);
		this.artist = artist;
		this.volume = volume;
	}
	
	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist) 
	{
		this.artist = artist;
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
		return super.toString()+"Artist"+artist+"\nVolume="+volume+"\n";
	}
}
