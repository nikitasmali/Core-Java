package interfaceAssignment;

public class Ball implements Bounceable, Movable
{

	@Override
	public void move() 
	{
		System.out.println("Ball can Move...");
	}

	@Override
	public void bounce()
	{
		System.out.println("Ball can Bounce...");
	}
	
}
