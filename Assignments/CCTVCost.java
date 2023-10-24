package com.demo.Classassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CCTVCost 
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        try 
	        {
	            System.out.print("Enter the total cost of CCTV cameras: ");
	            int totalCost = scanner.nextInt();
	            System.out.print("Enter the number of cameras purchased: ");
	            int no = scanner.nextInt();

	            if(no == 0) 
	            {
	                throw new ArithmeticException("Cannot divide by zero. Enter the number (non-zero) of cameras purchased.");
	            }

	            int costPerCamera = totalCost/no;
	            System.out.println("Cost per camera: " + costPerCamera);
	        } 
	        catch (InputMismatchException e)
	        {
	            System.out.println("Input is not an integer.");
	        } 
	        catch (ArithmeticException e)
	        {
	            System.out.println(e.getMessage());
	        } 
	        finally
	        {
	            scanner.close();
	        }
	   }
}

