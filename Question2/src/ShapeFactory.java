
// This class contains the Factory Method: getShape()
// Based on the input, it decides which shape object to create.

public class ShapeFactory {

    // Factory Method: returns a Shape object based on the given type
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;    // No type? Then nothing to create.
        }

        // Convert to uppercase to avoid case sensitivity issues
        switch (shapeType.toUpperCase()) {

            case "CIRCLE":
                return new Circle();    // Create a Circle

            case "RECTANGLE":
                return new Rectangle();    // Create a rectangle

            case "SQUARE":
                return new Square();    // Create a square

            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null; //invalid id input
        }
    }
}

