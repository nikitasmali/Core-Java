/*  Write a class ArrayDemo class with main() method .
 * In it write an array of 10 ints using new keyword and display it usng forEach loop. 
 * Then write an array of 5 floats using first class object notation 
 * and display it using forEach loop*/

package Array;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		int a[]=new int[10];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;  
		a[5]=12;
		a[6]=14;
		a[7]=16;
		a[8]=18;
		a[9]=20;  
		
		for(int i:a)
		{
			System.out.println("Elements are:"+i);
		}
		System.out.println("\n");
		float arr[]={2.3f,4.6f,7.8f,2.3f,4.5f};
		for(float i:arr)
		{
			System.out.println("Elelemts are:"+i);
		}
	}
}
