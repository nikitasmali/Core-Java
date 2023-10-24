package com.demo.Homeassignments;

import java.util.Scanner;

public class ArrayOperations
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (n):");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Entered Array:");
        printArray(arr);

        //Print the array in reverse order
        System.out.println("\nArray in Reverse Order:");
        reverseArray(arr);
        printArray(arr);

        // Delete an element from the array
        System.out.print("\nEnter the index of the element to delete (0 to"+(n - 1)+"):");
        int deleteIndex = scanner.nextInt();
        if (deleteIndex >= 0 && deleteIndex < n)
        {
            arr = deleteElement(arr, deleteIndex);
            System.out.println("Array after deleting element:");
            printArray(arr);
        } 
        else
        {
            System.out.println("Invalid index. Element deletion aborted.");
        }

        //Multiply every element of the array by 3
        multiplyArrayElements(arr, 3);
        System.out.println("\nArray after multiplying every element by 3:");
        printArray(arr);

        scanner.close();
    }

    public static void printArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method to delete an element at a specific index from an array
    public static int[] deleteElement(int[] arr, int index)
    {
        if (index < 0 || index >= arr.length)
        {
            return arr;
        }

        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (i != index) 
            {
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
    }

    public static void multiplyArrayElements(int[] arr, int factor)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= factor;
        }
    }
}