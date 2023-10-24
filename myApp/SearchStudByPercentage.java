package com.demo.myapp;

import java.util.ArrayList;

public class SearchStudByPercentage 
{
	    public static void searchStudentByPercentage(ArrayList<Student> studList, double percentage)
	    {
	        boolean found = false;
	        System.out.println("Students with Percentage " +percentage+ ":");
	        for (Student student : studList)
	        {
	            if (student.getPercentage() == percentage)
	            {
	                System.out.println(student);
	                found = true;
	            }
	        }
	        if (!found) 
	        {
	            System.out.println("No students found with Percentage " +percentage);
	        }
	    }
}
