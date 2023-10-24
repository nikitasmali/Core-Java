/* Write a method display() with parameter varArgs of int type in Demo class.
 * And write forEach loop to it to display vararg elements
 * Call the method display() in main() method by passing array of int type. 
 * Call again the same method display() by passing comma separated list of int type values */

package Array;

public class DemoClass
{
	public int display(int...nums)
	{
			for(int i:nums)
			{
				System.out.println("Elelemts are:"+i);
			}
			return 0;
	}
	public static void main(String[] args) 
	{
		DemoClass display=new DemoClass();
		int arr[]={1,2,3,4};
		display.display(arr);
		System.out.println("\n");
		display.display(2,3,4);
	}
}
