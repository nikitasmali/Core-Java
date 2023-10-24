package interfaceAssignment;

public class TestRemote 
{
	public static void main(String[] args)
	{
		RemoteDevice tv=new TV();
		tv.switchOn();
		tv.switchOff();
		
		RemoteDevice dvd=new DVDPlayer();
		dvd.switchOn();
		dvd.switchOff();
	}
}
