
// Concrete Factory that creates Light Theme UI Components

public class LightThemeFactory implements UIThemeFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
