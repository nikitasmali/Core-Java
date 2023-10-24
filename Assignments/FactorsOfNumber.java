package com.demo.Homeassignments;

import java.util.Scanner;

public class FactorsOfNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number==0)
        {
            System.out.println("Input cannot be zero.");
        } 
        else 
        {
            if (number<0)
            {
                number=Math.abs(number); 
            }

            System.out.print("Factors of "+number+":");
            for (int i=1;i<=number;i++)
            {
                if (number%i==0) 
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
