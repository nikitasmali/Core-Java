package interfaceAssignment;

public class TV implements RemoteDevice
{
	@Override
	public void switchOn()
	{
		System.out.println("TV is On...");
	}

	@Override
	public void switchOff() 
	{
		System.out.println("TV is Off...");
	}
}
