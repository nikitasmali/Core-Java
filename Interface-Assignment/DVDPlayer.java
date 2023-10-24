package interfaceAssignment;

public class DVDPlayer implements RemoteDevice
{

	@Override
	public void switchOn()
	{
		System.out.println("DVD Player is On...");
	}

	@Override
	public void switchOff() 
	{
		System.out.println("DVD Player is Off...");
	}

}
