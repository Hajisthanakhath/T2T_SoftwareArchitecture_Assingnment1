// FactoryMethodDemo.java
// Demonstrates the Factory Method Pattern by creating different shapes.

public class FactoryMethodDemo {
    public static void main(String[] args) {

        // Create the factory object
        ShapeFactory factory = new ShapeFactory();

        // Request different shapes from the factory
        Shape shape1 = factory.getShape("circle");
        Shape shape2 = factory.getShape("rectangle");
        Shape shape3 = factory.getShape("square");

        // Draw the shapes
        if (shape1 != null) shape1.draw();
        if (shape2 != null) shape2.draw();
        if (shape3 != null) shape3.draw();
    }
}
