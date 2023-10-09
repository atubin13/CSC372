package Mod4CT;

public class Cone extends Shape{
    //Attributes
    private final double radius;
    private final double height;

    //Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    //Overrides for math from Shape
    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    //toString method
    public String toString() {
        return "Cone - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }

    //Method for testing
    public static void main(String[] args) {
        //Cone with a radius of 5 and a height of 10
        Cone cone = new Cone(5,10);

        //Print calculation
        System.out.println(cone);
    }
}
