package components.popup;

import commons.AbsCommon;
import org.openqa.selenium.WebDriver;

public class AuthPopup extends AbsCommon implements IPopup<AuthPopup> {

    public AuthPopup(WebDriver driver) {
        super(driver);
    }

    @Override
    public AuthPopup popupShouldBeVisible() {
        return null;
    }

    @Override
    public AuthPopup popupShouldNotVisible() {
        return null;
    }
}
