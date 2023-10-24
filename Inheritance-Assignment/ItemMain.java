package inheritanceassignment;

public class ItemMain 
{
	public static void main(String[] args) 
	{
		Item item=new Item();
		System.out.println(item);
		
		Book book=new Book("Shakespeare","2nd edition", "1st volume", "Title - Hamlet", "Publisher - Simon", 2022, 8564738, 893.23);
		System.out.println(book);
		
		MusicCD musicCD=new MusicCD("Artist - Taylor Swift", "2nd Volume", "Title - Me!", "publisher - Universal Publishing group", 2020, 234573, 956.34);
		System.out.println(musicCD);
		
		Software software=new Software(2.7, "Title - Google chrome", "Publisher - Google", 2000, 234982, 75000.34);
		System.out.println(software);
	}
}
