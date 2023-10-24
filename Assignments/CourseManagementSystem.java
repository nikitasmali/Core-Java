package com.demo.Classassignments;

import java.util.Scanner;

public class CourseManagementSystem 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] courses = new String[20];
        int courseCount = 0;

        while (true)
        {
            System.out.println("Course Management System");
            System.out.println("1. Search for a course");
            System.out.println("2. Add a course");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the course to search: ");
                    String searchCourse = scanner.nextLine();
                    boolean courseFound = false;
                    for (int i = 0; i < courseCount; i++) {
                        if (courses[i].equalsIgnoreCase(searchCourse)) 
                        {
                            System.out.println("Course found: " + courses[i]);
                            courseFound = true;
                            break;
                        }
                    }
                    if (!courseFound)
                    {
                        System.out.println("Course not found.");
                    }
                    break;

                case 2:
                    if (courseCount >= 20)
                    {
                        System.out.println("Cannot add more courses. Maximum limit reached.");
                    } else
                    {
                        System.out.print("Enter the course to add: ");
                        String newCourse = scanner.nextLine();
                        if (newCourse.trim().isEmpty())
                        {
                            System.out.println("Course name cannot be empty.");
                        } else 
                        {
                            courses[courseCount] = newCourse;
                            courseCount++;
                            System.out.println("Course added successfully.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
