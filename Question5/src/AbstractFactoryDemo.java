
// Demonstrates the Abstract Factory Pattern based on user-selected theme.

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        // Suppose the user selected "dark" theme
        String userTheme = "dark";

        // Get the correct factory based on theme
        UIThemeFactory factory;

        if (userTheme.equalsIgnoreCase("light")) {
            factory = new LightThemeFactory();
        } else {
            factory = new DarkThemeFactory();
        }

        // Create UI components using the selected factory
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Use the components
        button.paint();
        checkbox.check();
    }
}

