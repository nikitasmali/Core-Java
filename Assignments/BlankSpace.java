package assignments;

public class BlankSpace 
{
	public static void main(String[] args)
	{
		String inputString = "Hello Welcome To Seed Infotech";
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < inputString.length(); i++)
		{
			char c = inputString.charAt(i);
			if(c != ' ')
			{
				result.append(c);
			}
		}
		System.out.println("Before removing blank space = "+inputString);
		System.out.println("After removing blank space = "+result.toString());
	}
}
