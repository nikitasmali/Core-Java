package com.demo.Homeassignments;

import java.util.Scanner;

public class CountPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        if(lowerLimit>upperLimit) 
        {
            System.out.println("Invalid input: Lower limit is greater than upper limit");
        } 
        else 
        {
            int primeCount = countPrimesInRange(lowerLimit, upperLimit);
            System.out.println("The count of prime numbers between"+lowerLimit+"and"+upperLimit + " is: " + primeCount);
        }
        scanner.close();
    }

    public static boolean isPrime(int num) 
    {
        if (num<=1)
        {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) 
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static int countPrimesInRange(int lower, int upper) 
    {
        int count=0;
        for (int i=lower;i<=upper;i++)
        {
            if (isPrime(i))
            {
                count++;
            }
        }
        return count;
    }
}
