package main;

import components.ProductSlider;
import components.popup.AuthPopup;
import extensions.UIExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(UIExtension.class)
public class MainPage_Test {

    @Inject
    private MainPage mainPage;

    @Inject
    private ProductSlider productSlider;

    @Inject
    private AuthPopup authPopup;


    @Test
    public void checkHeaderPage() {
        mainPage.open();
        authPopup.popupShouldNotVisible();
        mainPage.clickHeaderEvent();
        authPopup.popupShouldBeVisible()
                .sendKeysByEmailField("test@test.ru");
    }
}
