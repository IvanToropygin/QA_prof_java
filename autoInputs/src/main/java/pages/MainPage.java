package pages;

import annotations.Path;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Path("/")
public class MainPage extends AbsBasePage<MainPage>{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement header;

    public MainPage clickHeaderEvent() {
        driver.findElement(By.xpath(headerEvent)).click();
        return this;
    }

    private String headerEvent = "*//[@class=''header]";

    public MainPage clickHeaderTemplate(String... data) {
        driver.findElement(By.xpath(String.format("//*[@class='%s']", data))).click();
        return this;
    }
}
