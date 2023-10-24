package com.demo.Homeassignments;

import java.util.Scanner;

public class CandidateMain
{
    public static void main(String[] args)
    {
        try 
        {
            Candidate candidate=GetCandidateDetails();
            if(candidate!=null)
            {
                System.out.println("Candidate Details:");
                System.out.println("Name: " + candidate.getName());
                System.out.println("Gender: " + candidate.getGender());
                System.out.println("Expected Salary: $" + candidate.getExpectedSalary());
            }
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static Candidate GetCandidateDetails() throws InvalidSalaryException 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();
        System.out.print("Enter candidate gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter expected salary: ");
        double expectedSalary = scanner.nextDouble();
        scanner.close();
        if (expectedSalary<10000)
        {
            throw new InvalidSalaryException("Expected salary cannot be less than 10000");
        }
        return new Candidate(name, gender, expectedSalary);
    }
}
