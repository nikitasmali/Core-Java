package assignments;

public class CharacterCount 
{
	public static void main(String[] args)
	{
		String inputString = " Hello Good Morning ";
		
		//Without blank space only character count
		int count = 0;
		for(int i = 0; i < inputString.length(); i++)
			if(inputString.charAt(i) != ' ')
				count++;
		System.out.println("Total number of characters without blank space: " +count);
		
		//With blank space
		int totalChar = inputString.length();
		System.out.println("Total numbers of Characters with blank spaces: " +totalChar);
	}
}
