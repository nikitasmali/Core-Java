package parameterpassing;

public class MyDateSwap
{
	public static void swap(MyDate []nik) // nik = parameter ,we can use anything there as a variable /parameter to pass
	{
		MyDate temp = nik[0];
	     nik[0] =  nik[1];
	     nik[1] = temp;
	}
	
	//Swapping works using array
	
			
	
	public static void main(String[] args)
	{
		MyDate []dta=new MyDate[2];
		dta[0]=new MyDate(12, 7, 2002);
		dta[1]=new MyDate(13, 8, 2001);
		
		
		System.out.println("Before swapping :"+dta[0]+"\n"+dta[1]);
		swap(dta);
		System.out.println("\nAfter swapping:"+dta[0]+"\n"+dta[1]);
	}
}
