// AbstractFactoryDemo.java
// Demonstrates selecting a theme and generating UI components from the chosen factory.

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        String selectedTheme = "Light";  // Change to "dark" to test the other family
        UIThemeFactory factory;

        // Choose which factory to use based on theme
        if (selectedTheme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        // Create UI elements
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Use them
        button.paint();
        checkbox.check();
    }
}
