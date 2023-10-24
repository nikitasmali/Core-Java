package com.demo.Homeassignments;

public class FactorialSum
{
    public static void main(String[] args)
    {
        int[] numbers = {5, -4, 2, 12, 42, 3};
        int sum = 0;
        
        for (int number : numbers) 
        {
            if (isSingleDigitPositive(number)) 
            {
                sum += factorial(number);
            }
        }

        if (sum > 0)
        {
            System.out.println("Sum of factorial of positive single-digit numbers: " + sum);
        } 
        else
        {
            System.out.println("There is no positive and single digit in the array.");
        }
    }

    public static int factorial(int n) 
    {
        if (n == 0)
        {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result *= i;
        }
        return result;
    }

    public static boolean isSingleDigitPositive(int n) 
    {
        return n > 0 && n < 10;
    }
}
