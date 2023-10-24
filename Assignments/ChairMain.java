package assignment;

public class ChairMain
 {

	public static void main(String[] args)
	{
		Chair chair=new Chair();
		chair.initDetails();
		chair.showDetals();
		chair.setcolor("Black");
		chair.setmaterial("OfLeather");
		chair.setheight(98);
		chair.setweight(5);
		chair.showDetals();
	}

}
