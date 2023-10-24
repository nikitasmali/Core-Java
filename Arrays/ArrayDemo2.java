package Array;

public class ArrayDemo2
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4,5,6,7};
		
		
		//Traditional for loop
		int sum = 0;
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
			sum+=arr1[i];
		}
		System.out.println("Total = "+sum);
	
		
		//Enhanced for loop
		sum=0;
		for(int temp:arr1)
		{
			sum+=temp;
		}
		System.out.println("Total = "+sum);
	}
}
