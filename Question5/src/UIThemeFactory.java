// UIThemeFactory.java
// Abstract Factory: Creates related UI components (Button + Checkbox)

public interface UIThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
}

