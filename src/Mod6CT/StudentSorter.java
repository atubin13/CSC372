package Mod6CT;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Manually swap elements
                Student temp = students.get(i);
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }



    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Addison", "123 Main St"));
        students.add(new Student(2, "Chelsea", "456 Elm St"));
        students.add(new Student(3, "Charleigh", "789 Oak St"));
        students.add(new Student(4, "Rayna", "329 8th St."));
        students.add(new Student(5, "Jeff", "758 S. Wagon Dr."));
        students.add(new Student(6, "Adam", "486 West Mayfair Court"));
        students.add(new Student(7, "Patty", "70 Arlington Drive"));
        students.add(new Student(8, "Rachel", "7086 Cypress St."));
        students.add(new Student(9, "Harlow", "468 Orchard Dr."));
        students.add(new Student(10, "Hartford", "864 North Addison St."));

        // Sorting by name
        System.out.println("Sorting by Name:");
        selectionSort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by roll number
        System.out.println("\nSorting by Roll No:");
        selectionSort(students, new RollNoComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
