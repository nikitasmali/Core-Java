package com.demo.Homeassignments;

import java.util.List;
import java.util.Scanner;

public class CustomerMain
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        PhoneBook phoneBook=new PhoneBook();

        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1. Add a customer");
            System.out.println("2. Display all customers' details");
            System.out.println("3. Search customer by phone number");
            System.out.println("4. Delete a customer from the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    addCustomer(scanner, phoneBook);
                    break;
                case 2:
                    displayAllCustomers(phoneBook);
                    break;
                case 3:
                    searchCustomerByPhoneNumber(scanner, phoneBook);
                    break;
                case 4:
                    deleteCustomer(scanner, phoneBook);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void addCustomer(Scanner scanner, PhoneBook phoneBook) 
    {
        System.out.print("Enter customer's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter customer's last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter customer's phone number: ");
        Long phoneNumber = scanner.nextLong();
        scanner.nextLine(); 
        System.out.print("Enter customer's email: ");
        String email=scanner.nextLine();
        Customer customer=new Customer(firstName, lastName, phoneNumber, email);
        phoneBook.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    public static void displayAllCustomers(PhoneBook phoneBook) 
    {
        List<Customer> customers=phoneBook.viewAllCustomers();
        if (customers.isEmpty()) 
        {
            System.out.println("No customers found.");
        } 
        else
        {
            System.out.println("All Customers' Details:");
            for (Customer customer:customers)
            {
                System.out.println(customer);
            }
        }
    }
    public static void searchCustomerByPhoneNumber(Scanner scanner, PhoneBook phoneBook) {
        System.out.print("Enter phone number to search: ");
        long phoneNo=scanner.nextLong();
        Customer customer=phoneBook.viewCustomerByPhone(phoneNo);
        if(customer!=null)
        {
            System.out.println("Customer Found:");
            System.out.println(customer);
        } 
        else 
        {
            System.out.println("Customer not found.");
        }
    }

    public static void deleteCustomer(Scanner scanner, PhoneBook phoneBook)
    {
        System.out.print("Enter phone number to delete: ");
        long phoneNo=scanner.nextLong();
        boolean removed=phoneBook.removeCustomer(phoneNo);
        if(removed) 
        {
            System.out.println("Customer deleted successfully.");
        } 
        else 
        {
            System.out.println("Customer not found.");
        }
    }
}
