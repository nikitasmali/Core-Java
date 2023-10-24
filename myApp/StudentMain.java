package com.demo.myapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain
{
	public static void main(String[] args)
	{
	ArrayList<Student> studList=new ArrayList<>();
	Student s1=new Student(2, 78, "MNO");
	Student s2=new Student(1, 96, "ABC");
	Student s3=new Student(4, 88, "XYZ");
	Student s4=new Student(5, 92, "LMN");
	Student s5=new Student(3, 87, "PQR");
	studList.add(s1);
	studList.add(s2);
	studList.add(s3);
	studList.add(s4);
	studList.add(s5);
	
	System.out.println("\nBefore Sorting:");
	for(Student student:studList)
		System.out.println(student);
	
	System.out.println("\nAfter Sorting by Roll No");
	Collections.sort(studList, new SortStudByRollNo());
	for(Student student:studList)
		System.out.println(student);
	
	System.out.println("\nAfter Sorting on Name");
	Collections.sort(studList, new SortStudByName());
	for(Student student:studList)
		System.out.println(student);
	
	System.out.println("\nAfter Sorting on percentage");
	Collections.sort(studList, new SortStudByPerc());
	for(Student student:studList)
		System.out.println(student);
	
     System.out.println("\nEnter Roll No to search: ");
     Scanner sc1=new Scanner(System.in);
     int rollNo1 = sc1.nextInt();
     SearchStudByRollNo.searchStudentByRollNo(studList, rollNo1);
   
     System.out.println("\nEnter Percentage to search: ");
     Scanner sc2=new Scanner(System.in);
     double percentage1 = sc2.nextDouble();
     SearchStudByPercentage.searchStudentByPercentage(studList, percentage1);

     System.out.println("\nEnter Name to search: ");
     Scanner sc3=new Scanner(System.in);
     String name1 = sc3.nextLine();
     SearchStudByName.searchStudentByName(studList, name1);
        
     Menu menu = new Menu();
     menu.displayMenu();
     }
		
		public static void writeFile(ArrayList<Student> a1)
		{
		try
		{
			FileOutputStream fos=new FileOutputStream("StudData1.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos); 
			for(Student s:a1)
			  oos.writeObject(s);
			System.out.println("File Writing Completed...!");
			
			FileInputStream fis=new FileInputStream("StudData1.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);	
			System.out.println(ois.readObject());
			System.out.println("Done All");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		/*finally
		{
			try
			{
				if(fos!=null)
					fos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}*/    
     }
}        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

















        /*
		System.out.println("Enter a rollno to search:");
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		boolean RollNo = searchByRollNo(studlist, temp);
		if(RollNo)
		{
			System.out.println("Roll Number " +temp+ " is present");
		}
		else
		{
			System.out.println("Roll Number " +temp+ " is not present");
		}
		
		System.out.println("Enter Percentage to search:");
		Scanner sc1=new Scanner(System.in);
		int temp2=sc.nextInt();
		boolean Percent=searchByPercentage(studlist, temp2);
		if(Percent)
		{
			System.out.println("Percenatge "+temp2+" is available");
		}
		else
		{
			System.out.println("Percenatge "+temp2+" is not available");
		}
		
		System.out.println("Enter name to search");
		Scanner sc2=new Scanner(System.in);
		String temp3=sc.next();
		boolean name=searchByName(studlist, temp3);
		if(name)
		{
			System.out.println("Percenatge "+temp3+" is Present");
		}
		else
		{
			System.out.println("Percenatge "+temp3+" is not Present");
		}
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fos=new FileOutputStream("MenuData.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);  //Serialization
			DemoMenu dm1=new DemoMenu();
			oos.writeObject(dm1);
			System.out.println("Done Checking");
			
			fis=new FileInputStream("MenuData.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);	//DeSerialization
			System.out.println(ois.readObject());
			System.out.println("Done All");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fos!=null)
					fos.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	private static boolean searchByName(ArrayList<Student> studlist, String temp3)
	{
		for(Student s:studlist)
		{
			if(s.getName().equals(temp3))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean searchByPercentage(ArrayList<Student> studlist, int temp2)
	{
		for(Student s:studlist)
		{
			if(s.getPercentage() == temp2)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean searchByRollNo(ArrayList<Student> studlist, int temp)
	{
		for(Student s:studlist)
		{
			if(s.getRollno() == temp)
			{
				return true;
			}
		}
		return false;
	}
	*/
