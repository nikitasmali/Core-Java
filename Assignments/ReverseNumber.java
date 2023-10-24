package com.demo.Homeassignments;

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number==0)
        {
           System.out.println("Number entered is zero.");
        } 
        else if(number<0) 
        {
            System.out.println("Number is negative.");
        } 
        else
        {
            int reversedNumber = reverseNumber(number);
            System.out.println("Reversed number: " + reversedNumber);
        }
        scanner.close();
    }

    public static int reverseNumber(int num)
    {
        int reversedNum = 0;
        while(num!=0)
        {
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num/=10;
        }
        return reversedNum;
    }
}
