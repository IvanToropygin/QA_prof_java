package factory;

import factory.settings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebdriverFactory {

    private String browserName = System.getProperty("browser.name", "chrome").toLowerCase().trim();

    public WebDriver getDriver() {
        switch (browserName) {
            case "chrome": {
                return new ChromeDriver(
                        (ChromeOptions) new ChromeSettings().getSettings(new DesiredCapabilities()));
            }
        }

        throw new WebDriverException();
    }
}
