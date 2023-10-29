package Mod6CT;

public class Student {
    // Setters
    private int rollno;
    private String name;
    private String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno; // Assign rollno
        this.name = name; // Assign name
        this.address = address; // Assign address
    }
    // Getters
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student [Roll No. : " + rollno + ", Name : " + name + ", Address : "
                + address + "]";
    }
}
