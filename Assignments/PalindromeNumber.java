package com.demo.Homeassignments;

import java.util.Scanner;

public class PalindromeNumber
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
            System.out.println("Invalid input: Lower limit is greater than upper limit.");
        }
        else
        {
            System.out.println("Palindrome numbers between"+lowerLimit+"and"+upperLimit+":");
            findAndDisplayPalindromes(lowerLimit, upperLimit);
        }
        scanner.close();
    }

    public static boolean isPalindrome(int num)
    {
        int reversedNum=0;
        int originalNum=num;

        while(num!=0) 
        {
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num/=10;
        }
        return originalNum==reversedNum;
    }

    public static void findAndDisplayPalindromes(int lower, int upper) 
    {
        for(int i=lower;i<=upper;i++) 
        {
            if (isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}







