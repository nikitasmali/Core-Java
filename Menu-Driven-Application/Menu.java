package menudrivenapllication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu 
{
    private static ArrayList<Student> students = new ArrayList<>();
    Student s1=new Student(1, "ABC", 98.5);
    Student s2 = new Student(2, "PQR", 75.9);
    Student s3 = new Student(3, "LMN", 88.5);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        students = StudentService.readStudents();
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    sortStudents();
                    break;
                case 5:
                    sortStudentsByRollNo();
                    break;
                case 6:
                    sortStudentsByName();
                    break;
                case 7:
                    sortStudentsByPercentage();
                    break;
                case 8:
                    searchStudentByRollNo();
                    break;
                case 9:
                    searchStudentByName();
                    break;
                case 10:
                    searchStudentByPercentage();
                    break;
                case 11:
                    StudentService.writeStudents(students);
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 11);
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Display Students");
        System.out.println("4. Sort Students");
        System.out.println("5. Sort Students by Roll No");
        System.out.println("6. Sort Students by Name");
        System.out.println("7. Sort Students by Percentage");
        System.out.println("8. Search Student by Roll No");
        System.out.println("9. Search Student by Name");
        System.out.println("10. Search Student by Percentage");
        System.out.println("11. Exit");
    }

    private static void addStudent() 
    {
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();
        students.add(new Student(rollNo, name, percentage));
        System.out.println("Student added successfully.");
    }

    private static void updateStudent() 
    {
        System.out.print("Enter Roll No to update: ");
        int rollNo = scanner.nextInt();
        int index = findStudentIndexByRollNo(rollNo);
        if (index != -1) {
            Student student = students.get(index);
            System.out.println("Current details: " + student);
            System.out.print("Enter new Name: ");
            scanner.nextLine(); // Consume the newline character
            String name = scanner.nextLine();
            System.out.print("Enter new Percentage: ");
            double percentage = scanner.nextDouble();
            student = new Student(student.getRollNo(), name, percentage);
            students.set(index, student);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static int findStudentIndexByRollNo(int rollNo)
    {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                return i;
            }
        }
        return -1;
    }

    private static void displayStudents()
    {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void sortStudents()
    {
        Collections.sort(students, Comparator.comparingDouble(Student::getPercentage).reversed());
        System.out.println("Students sorted by percentage.");
    }

    private static void sortStudentsByRollNo()
    {
        Collections.sort(students, Comparator.comparingInt(Student::getRollNo));
        System.out.println("Students sorted by Roll No.");
    }

    private static void sortStudentsByName() 
    {
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by Name.");
    }

    private static void sortStudentsByPercentage()
    {
        Collections.sort(students, Comparator.comparingDouble(Student::getPercentage).reversed());
        System.out.println("Students sorted by Percentage.");
    }

    private static void searchStudentByRollNo()
    {
        System.out.print("Enter Roll No to search: ");
        int rollNo = scanner.nextInt();
        int index = findStudentIndexByRollNo(rollNo);
        if (index != -1) {
            System.out.println(students.get(index));
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudentByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Student student : students) 
        {
            if (student.getName().equalsIgnoreCase(name))
            {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudentByPercentage()
    {
        System.out.print("Enter Percentage to search: ");
        double percentage = scanner.nextDouble();
        boolean found = false;
        for (Student student : students)
        {
            if (student.getPercentage() == percentage)
            {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}