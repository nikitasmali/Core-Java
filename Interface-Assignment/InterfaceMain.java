package interfaceAssignment;

public class InterfaceMain 
{
	public static void main(String[] args)
	{
		Bounceable ball=new Ball();
		ball.bounce();
		((Ball)ball).move();  //TypeCasting
		
		Movable car=new Car();
		car.move();
	}
}
