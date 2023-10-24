package com.demo.innerdemo;

public class Outer
{
private int onum;
	
	public Outer() 
	{
		onum = 123;
	}
	
	public Outer(int onum)
	{
		this.onum=onum;
	}
	
	public void show()
	{
		System.out.println("The value of member of Outer class="+onum);
	}
	
	
	class Inner
	{
		private int inum=456;
		
		public void showI()
		{
			System.out.println("The value of member of Outer class="+onum);
			System.out.println("The value of member of Inner class="+inum);
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Outer outer=new Outer();
		outer.show();
		
		// Using Instance of outer class to create object of inner class
		Inner inner=outer.new Inner();
		inner.showI();
	}

}
