package com.demo.myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Menu 
{
    private ArrayList<Student> studList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu()
    {
    	int choice = 1;
        while (choice!=0)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Sort Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice1 = scanner.nextInt();
            switch (choice1) 
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    sortStudent();
                    break;
                case 5:
                	exit();
                	break;
                case 0:
    				System.out.println("You exit the system");
    				scanner.close();
    				return;
    			default:
    				System.out.println("Enter valid choice:");
            }
        }
        
    }

    public void addStudent()
    {
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        Student student = new Student(rollNo, name, percentage);
        studList.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent()
    {
        System.out.print("Enter Roll No to update: ");
        int rollNo = scanner.nextInt();

        for (Student student : studList)
        {
            if (student.getRollno() == rollNo)
            {
                System.out.print("Enter new Percentage: ");
                double newPercentage = scanner.nextDouble();
                student.setPercentage(newPercentage);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }

    public void displayStudent() 
    {
        if (studList.isEmpty())
        {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("\nStudent List:");
        for (Student student : studList) 
        {
            System.out.println(student);
        }
    }

    public void sortStudent()
    {
        Collections.sort(studList, new SortStudByRollNo());
        System.out.println("Students sorted by Roll No.");
    }
    
    public void exit()
	{
		System.out.println("Exits out of application");
	}
    
    public void displayStudentUsingIterator(ArrayList<Student> studList)
    {
        if (studList.isEmpty()) 
        {
            System.out.println("No students to display");
            return;
        }

        System.out.println("\nStudent List using Iterator=");
        Iterator<Student> iterator = studList.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
    }
}

    /*
    public void searchByRollNo(ArrayList<Student> studList, Scanner scanner)
    {
        System.out.print("Enter Roll No to search: ");
        int rollNo1 = scanner.nextInt();
        SearchStudByRollNo.searchStudentByRollNo(studList, rollNo1);
    }

    public void searchByPercentage(ArrayList<Student> studList, Scanner scanner)
    {
        System.out.print("Enter Percentage to search: ");
        double percentage1 = scanner.nextDouble();
        SearchStudByPercentage.searchStudentByPercentage(studList, percentage1);
    }

    public void searchByName(ArrayList<Student> studList, String nameScanner scanner)
    {
        System.out.print("Enter Name to search: ");
        scanner.nextLine(); 
        String name1 = scanner.nextLine();
        SearchStudByName.searchStudentByName(studList, name1);
    }
    */
    /* public void sortByRollNo(ArrayList<Student> studList, int choice1)
    {
    	System.out.println("After Sorting by Roll No");
		Collections.sort(studList, new SortStudByRollNo());
		for(Student student:studList)
			System.out.println(student);
    }
    
    public void sortByName(ArrayList<Student> studList, int choice1)
    {
    	System.out.println("After Sorting on Name");
		Collections.sort(studList, new SortStudByName());
		for(Student student:studList)
			System.out.println(student);
    }
    
    public void sortByPercentage(ArrayList<Student> studList, double choice1)
    {
    	System.out.println("After Sorting on percentage");
		Collections.sort(studList, new SortStudByPerc());
		for(Student student:studList)
			System.out.println(student);
    }
    */
}
