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

    private String headerEvent = "*//[@class=''header]";

    public MainPage clickHeaderEvent() {
        $(By.xpath(headerEvent)).click();
        return this;
    }



    public MainPage clickHeaderTemplate(String... data) {
        $(By.xpath(String.format("//*[@class='%s']", data))).click();
        return this;
    }
}
