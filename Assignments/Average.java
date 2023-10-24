package assignments;

public class Average
{
	public static void main(String[] args)
	{
		int[] num = {10,20,30,40,50,60,70,80,90,100};
		double sum = 0;
		for(int number:num)
		{
			sum += number;
		}
		double average = sum / num.length;
		System.out.println("Average:"+average);
		
		System.out.println("Elements of array using enhanced for loop:");
		for(int i = 0; i < num.length; i++)
			System.out.println(num[i]+" ");
	}
}
