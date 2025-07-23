package waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    private WebDriver driver;
    private int waiterTimeout = Integer.parseInt(System.getProperty("waiter.timeout"));

    public Waiter(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition condition) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(waiterTimeout));
            return true;
        } catch (TimeoutException ignored) {
            return false;
        }
    }

    public boolean waitForElementVisible(By locator) {
        return this.waitForCondition(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean waitForElementNotVisible(By locator) {
        return this.waitForCondition(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}
