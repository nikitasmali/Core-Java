package com.demo.Homeassignments;

import java.util.Scanner;

public class MonthsAndWeekDisplay 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Menu:");
            System.out.println("1. Display the months");
            System.out.println("2. Display the weekdays");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice)
            {
                case 1:
                    displayMonths();
                    break;
                case 2:
                    displayWeekdays();
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

    //display month names
    public static void displayMonths()
    {
        String[] months ={"January", "February", "March", "April","May", "June", "July", "August","September", "October", "November", "December"};
        System.out.println("Month Names:");
        for (String month : months) {
            System.out.println(month);
        }
    }

    //display weekday names
    public static void displayWeekdays()
    {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"};

        System.out.println("Weekday Names:");
        for (String weekday : weekdays) 
        {
            System.out.println(weekday);
        }
    }
}
