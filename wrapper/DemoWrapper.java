package wrapper;

public class DemoWrapper
{
	public static void main(String[] args) 
	{
		int a = 20;
		Integer iobj1 = new Integer(a); //Boxing
		Integer iobj2 = new Integer(30);
		
		int b=iobj2.intValue(); //Unboxing
		int c=12;     //Auto Boxing
		Integer ob4 = new Integer(40);
		int d=ob4; //Auto Unboxing--Implicit conversion
		String s1 = "411304";
		int pincode= Integer.parseInt(s1);
		System.out.println(pincode);
		
		
		String s2="10";
		String s3="20";
		String s4=s2+s3;
		System.out.println(s4); //concatination
		
		//Addition
		int sum=Integer.parseInt(s2)+Integer.parseInt(s2);
		System.out.println(sum);
		
		String s5= "90";
		Integer ob5 = Integer.valueOf(s5);
		System.out.println(ob5);	
	}
}