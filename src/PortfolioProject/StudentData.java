package PortfolioProject;

import java.util.*;
import java.io.*;

public class StudentData {
    public static void main(String[] args) {
        // Create a linked list to store student objects
        LinkedList<Student> studentList = new LinkedList<>();

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter student data until they choose to stop
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("Enter student data:");

            // Prompt for name, address, and GPA
            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Address: ");
            String address = input.nextLine();

            double gpa = 0.0;
            boolean validGPA = false;

            // Validate numeric data for GPA
            while (!validGPA) {
                try {
                    System.out.print("GPA: ");
                    gpa = Double.parseDouble(input.nextLine());
                    validGPA = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid GPA (numeric value).");
                }
            }

            // Create a student object and add it to the linked list
            Student student = new Student(name, address, gpa);
            studentList.add(student);

            // Ask the user if they want to enter more student data
            System.out.print("Do you want to enter more student data? (yes/no): ");
            String choice = input.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                continueInput = false;
            }
        }

        // Sort the student list by name in ascending order
        studentList.sort(Comparator.comparing(Student::getName));

        // Create and write the sorted student data to a text file
        try (PrintWriter outputFile = new PrintWriter("student_data.txt")) {
            for (Student student : studentList) {
                outputFile.println(student.toString());
            }
            System.out.println("Student data has been written to student_data.txt.");
        } catch (IOException e) {
            System.err.println("Error writing to the file.");
        }

        // Close the Scanner
        input.close();
    }
}

class Student {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
    }
}
