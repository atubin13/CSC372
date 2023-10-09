package Mod4CT;

public class Sphere extends Shape{
    //Attribute
    private final double radius;

    //Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        //Math for the surface area of a sphere
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        //Math for the volume of a sphere
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    //toString method
    public String toString() {
        return "Sphere - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }

    //Method for testing
    public static void main(String[] args) {
        //Sphere with a radius of 12
        Sphere sphere = new Sphere(12.0);

        //Print calculation
        System.out.println(sphere);
    }
}
