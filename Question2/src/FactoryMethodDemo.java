
// This class demonstrates the Factory Method Pattern.
// We use the factory to create different shapes without using 'new' in the main program
public class FactoryMethodDemo {
    public static void main(String[] args) {

        // Create the factory that will produce shapes
        ShapeFactory factory = new ShapeFactory();

        // Request different shapes from the factory
        Shape shape1 = factory.getShape("circle");
        Shape shape2 = factory.getShape("rectangle");
        Shape shape3 = factory.getShape("square");

        // Draw the shapes (if they are valid)
        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
    }
}
