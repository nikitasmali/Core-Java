package com.demo.myapp;

import java.util.ArrayList;

public class SearchStudByName 
{
	    public static void searchStudentByName(ArrayList<Student> studList, String name) 
	    {
	        boolean found = false;
	        System.out.println("Students with Name " +name+ ":");
	        for (Student student : studList) 
	        {
	            if (student.getName().equalsIgnoreCase(name))
	            {
	                System.out.println("Roll No: " +student.getRollno()+ ", Name: " +student.getName());
	                found = true;
	            }
	        }
	        if (!found) 
	        {
	            System.out.println("No students found with Name " +name);
	        }
	    }
}
