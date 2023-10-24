package com.demo.innerdemo;

public class DemoString
{
	public static void main(String[] args)
	{
	   //first way of creating object without new keyword
	   String string="ABC";
	   System.out.println(string);

	   //Second way of creating object with new
	   String string1=new String("ABC");
	   System.out.println(string1);
	   
	   String string2="ABC";
	   System.out.println(string2);
	   
	   if(string==string2)
		   System.out.println("Both same");  
	   else
		   System.out.println("Not same");
	   
	   string2=string2+"XYZ";
	   System.out.println(string2);
	   
	   //difference between "==" and "equals")
	   if(string==string1)
		   System.out.println("Both same");
	   else
		   System.out.println("Not same");
	   if(string.equals(string1))
		   System.out.println("Both same");
	   else
		   System.out.println("Not same");
	   
	   
	   //Switch: we can pass string in switch 
	   String color="red";
	   switch (color) 
	   {
	   	case "red":System.out.println("Color is red");
		break;
		
		case "green":System.out.println("Color is green");
		break;
		
		default:System.out.println("Color is not found");
		break;
	   }
		//Methods of string
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "World";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3));	//false
		System.out.println(s2.equals(s3)); //true
		System.out.println(s3.replace('r', 'R')); //WoRld
		System.out.println(s1.contains("Hel")); //true
		System.out.println(s2.contains("e")); //false
		System.out.println(s1.contains("Hi")); //false
		System.out.println(s1.charAt(0)); //H
		System.out.println(s1.length()); //5
		System.out.println(s1.toUpperCase()); //HELLO
		System.out.println(s1.toLowerCase()); //hello
 		
	
	}

}
