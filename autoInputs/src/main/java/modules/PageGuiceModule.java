package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class PageGuiceModule extends AbstractModule {

    private WebDriver driver;

    public PageGuiceModule(WebDriver driver) {
        this.driver = driver;
    }

    @Provides
    @Singleton
    private MainPage getMainPage() {
        return new MainPage(driver);
    }
}
