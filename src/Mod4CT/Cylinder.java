package Mod4CT;

public class Cylinder extends Shape{
    //Attributes
    private final double radius;
    private final double height;

    //Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    //Overrides for math from Shape
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    //toString method
    public String toString() {
        return "Cylinder - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }

    //Method for testing
    public static void main(String[] args) {
        //Cylinder with a radius of 5 and a height of 10
        Cylinder cylinder = new Cylinder(5,10);

        //Print calculation
        System.out.println(cylinder);
    }
}
