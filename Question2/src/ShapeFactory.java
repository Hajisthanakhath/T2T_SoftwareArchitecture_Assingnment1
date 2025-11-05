// ShapeFactory.java
// Factory class that creates Shape objects based on input.

public class ShapeFactory {

    // Factory Method: returns a Shape object based on the given type
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;    // return nothing if input is null
        }

        // Convert to uppercase to avoid case sensitivity issues
        switch (shapeType.toUpperCase()) {

            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }
}

