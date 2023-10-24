package inheritanceassignment;

public class Player
{
	private int playerId;
	private String playerName;
	private int age;
	private String country;
	
	
	public Player()
	{
		this(7, "ABC", 22, "India");
	}
	
	public Player(int playerId, String playerName, int age, String country)
	{
		this.playerId=playerId;
		this.playerName=playerName;
		this.age=age;
		this.country=country;
	}
	
	@Override
	public String toString()
	{
		return "Player Details:\nPlayer Id="+playerId+"\nPlayer Name="+playerName+"\nAge="+age+"\nCountry="+country+"\n";
	}
}
