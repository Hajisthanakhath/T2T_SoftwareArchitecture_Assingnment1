
// Concrete Factory that creates Dark Theme UI Components

public class DarkThemeFactory implements UIThemeFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

