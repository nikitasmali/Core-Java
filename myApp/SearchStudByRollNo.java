package com.demo.myapp;

import java.util.ArrayList;

public class SearchStudByRollNo 
{
		public static void searchStudentByRollNo(ArrayList<Student> studList, int rollNo)
		{
	        for (Student student : studList)
	        {
	            if (student.getRollno() == rollNo)
	            {
	                System.out.println("Student with Roll No " +rollNo+ " is present: " +student);
	                return;
	            }
	        }
	        System.out.println("Student with Roll No " +rollNo+ " not found.");
	    }
}


