package com.demo.Classassignments;

public class MainClassHostel 
{
    public static Hosteler getHostelerDetails()
    {
        return new Hosteler(101, "ABC", 1, "Female", "1234567890", "Hostel A", 203);
    }

    public static void main(String[] args)
    {
        
        Hosteler hosteler = getHostelerDetails();
  
        System.out.println("Initial Hosteler Details:");
        System.out.println("Student ID: " + hosteler.getStudId());
        System.out.println("Name: " + hosteler.getName());
        System.out.println("Department ID: " + hosteler.getDeptId());
        System.out.println("Gender: " + hosteler.getGender());
        System.out.println("Phone Number: " + hosteler.getPhoneNo());
        System.out.println("Hostel Name: " + hosteler.getHostelName());
        System.out.println("Room Number: " + hosteler.getRoomNo());

        hosteler.setRoomNo(401);
        hosteler.setPhoneNo("9876543210");

        System.out.println("\nUpdated Hosteler Details:");
        System.out.println("Student ID: " + hosteler.getStudId());
        System.out.println("Name: " + hosteler.getName());
        System.out.println("Department ID: " + hosteler.getDeptId());
        System.out.println("Gender: " + hosteler.getGender());
        System.out.println("Phone Number: " + hosteler.getPhoneNo());
        System.out.println("Hostel Name: " + hosteler.getHostelName());
        System.out.println("Room Number: " + hosteler.getRoomNo());
    }
}
