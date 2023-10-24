package menudrivenapllication;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Serializable 
{
    private int rollNo;
    private String name;
    private double percentage;

    public Student(int rollNo, String name, double percentage)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString()
    {
        return "Roll No: " + rollNo + ", Name: " + name + ", Percentage: " + percentage;
    }
}




