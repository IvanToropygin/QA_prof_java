package main;

import extensions.UIExtension;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(UIExtension.class)
public class MainPage_Test {

    @Inject
    private MainPage mainPage;


    @Test
    public void checkHeaderPage() {
//        mainPage.
    }
}
