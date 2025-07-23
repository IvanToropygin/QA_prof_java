package components.popup;

import commons.AbsCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthPopup extends AbsCommon implements IPopup<AuthPopup> {

    public AuthPopup(WebDriver driver) {
        super(driver);
    }

    private By popupBy = By.cssSelector(".auth");

    @Override
    public AuthPopup popupShouldBeVisible() {
        assertThat(waiter.waitForElementVisible(popupBy)).as("Error").isTrue();
        return null;
    }

    @Override
    public AuthPopup popupShouldNotVisible() {
        assertThat(waiter.waitForElementNotVisible(popupBy)).as("Error").isTrue();
        return null;
    }

    public AuthPopup sendKeysByEmailField(String email) {
        $(popupBy).findElement(By.xpath(".//*[@class='email']"))
                .sendKeys(email);
        return this;
    }
}
