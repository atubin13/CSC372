package Mod4CT;

public class ShapeArray {
    public static void main(String[] args) {
        //Instantiate sphere, cylinder, cone
        Sphere sphere = new Sphere (18);
        Cylinder cylinder = new Cylinder(17,29);
        Cone cone = new Cone(17,29);

        //Store the class into an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        //Loop through the array and output to console
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
